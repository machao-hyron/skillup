package com.example.demo.config;

import com.example.demo.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * 采用JavaBean的形式来代替传统的xml配置文件形式进行针对框架个性化定制，
 * 可以自定义一些Handler，Interceptor，ViewResolver，MessageConverter。
 * @author Youth
 *
 */
@Configuration
public class AdminInterceptorConfig implements WebMvcConfigurer {
	/**
	 * 配置拦截器Interceptor
	 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")  //所有请求都被拦截包括静态资源
                .excludePathPatterns("/login","/css/**","/favicon.ico","/assets/**",
                        "/js/**"); //放行的请求
    }

    /**
     * 配置一个视图解析器
     * 实现无业务跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}
