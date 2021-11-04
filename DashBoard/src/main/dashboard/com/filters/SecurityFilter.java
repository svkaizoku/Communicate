//$Id$
package com.filters;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SecurityFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//HttpServletRequest req = (HttpServletRequest)request;
		/*
		HttpServletRequest r = (HttpServletRequest) request;
		try {
			String uri = r.getRequestURI();
			if(!uri.equals("/")) {
				if(!uri.contains("login")) {
					throw new RuntimeException();
				}
			}
			chain.doFilter(request, response);
		}catch(Exception e) {
			throw new RuntimeException();
			//chain.doFilter(request, response);
		}*/
		chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
