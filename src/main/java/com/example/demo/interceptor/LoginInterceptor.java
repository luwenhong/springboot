package com.example.demo.interceptor;

import org.aopalliance.intercept.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录检查
 * 1 配置好拦截器要拦截哪些请求
 * 2 把拦截器配置放在容器中
 * 3
 */

public class LoginInterceptor implements HandlerInterceptor {
	/**
	 * 目标方法执行前
	 *
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//登录检查逻辑
		HttpSession session = request.getSession();
		Object loginuser = session.getAttribute("loginuser");
		if(loginuser!=null){
			return  true;   //放行
			
		}else {return false;}
		
	}
	
	/**
	 * 目标方法执行后
	 *
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	
	}
	
	/**
	 * 页面渲染后
	 *
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	
	}
}
