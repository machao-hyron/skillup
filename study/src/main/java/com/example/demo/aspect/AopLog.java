package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AopLog {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    ThreadLocal<Long> startTime = new ThreadLocal<>();
    //定义切点
    @Pointcut(value = "execution(* com.example.demo.controller.*.*(..))")
    public void controllerLog() {
    }
    @Pointcut(value = "execution(* com.example.demo.service.*.*(..))")
    public void serviceLog() {
    }
    //使用环绕通知
    @Around("controllerLog() || serviceLog()")
    public Object myLogger(ProceedingJoinPoint point) throws Throwable {
        startTime.set(System.currentTimeMillis());
        //使用ServletRequestAttributes请求上下文获取方法更多
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String className = point.getSignature().getDeclaringTypeName();
        String methodName = point.getSignature().getName();

        //执行函数前打印日志
        logger.info("方法开始：{}：{}", className, methodName);
        logger.info("URL:{}", request.getRequestURL().toString());
        logger.info("IP地址：{}", request.getRemoteAddr());
        //调用整个目标函数执行
        Object obj = point.proceed();
        //执行函数后打印日志
        logger.info("方法结束：{}：{}", className, methodName);
        logger.info("耗时：{}ms", System.currentTimeMillis() - startTime.get());
        return obj;
    }
}