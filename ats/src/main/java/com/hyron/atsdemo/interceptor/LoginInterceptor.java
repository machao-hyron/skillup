//package com.hyron.atsdemo.interceptor;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpSession;
//
//@Component
//@Slf4j
//public class LoginInterceptor implements HandlerInterceptor{
//    @Override
//    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
//            log.info("进行拦截");
//            Object number = request.getSession().getAttribute("number");
//            if (number == null) {
//                response.sendRedirect("/login");
//                return false;
//            } else {
//                return true;
//            }
//        }
//    @Override
//    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//}
