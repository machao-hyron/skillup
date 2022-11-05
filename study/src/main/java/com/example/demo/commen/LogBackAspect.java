package com.example.demo.commen;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBackAspect {
    private Logger logger = LoggerFactory.getLogger(LogBackAspect.class);

    @Pointcut("@annotation(com.example.demo.commen.LogBack)")
    public void myPointCut() {
        //抽取出切入点，给增强通知使用
    }

    @Around("myPointCut()")
    public Object printLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("前");
        System.out.println("目标方法被调用");
        Object o = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());

        logger.info("后");
        return o;
    }
}
