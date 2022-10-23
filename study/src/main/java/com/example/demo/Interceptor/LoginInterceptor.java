package com.example.demo.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

/**
 * 登录检查
 * 1、配置好拦截器要拦截哪些请求
 * 2、把这些配置放在容器中
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

  /**
     * 登录之前检查
     */
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

	//求行中的资源名部分
    StringBuffer requestURI = request.getRequestURL();
    log.info("preHandle拦截的请求路径是{}",requestURI);

    //获取请求的session对象信息
    HttpSession session = request.getSession();

    //获取登录对象ID
    Object loginUserID = session.getAttribute("id");

    //判断对象ID是否不为null，true则表示已登录，放行，反之，拦截
    if(loginUserID != null){
      //放行
      return true;
    }

    //拦截住。未登录。跳转到登录页
    request.setAttribute("msg","请先登录");
    //转发至login controller 
    request.getRequestDispatcher("/login").forward(request,response);
    return false;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    log.info("postHandle执行{}",modelAndView);
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception {
    log.info("afterCompletion执行异常{}",e);
  }
}

