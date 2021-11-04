//$Id$
package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class CommonController extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
	public HttpServletResponse response;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	public String execute() {
		return SUCCESS;
	}

}
