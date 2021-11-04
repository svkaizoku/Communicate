//$Id$
package com.config;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.RequestUtils;
import org.apache.struts2.dispatcher.mapper.ActionMapper;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.dispatcher.mapper.DefaultActionMapper;

import com.opensymphony.xwork2.config.ConfigurationManager;


public class CustomActionMapper extends DefaultActionMapper implements ActionMapper{
	public ActionMapping getMapping(HttpServletRequest request, ConfigurationManager configManager){
		ActionMapping map = new ActionMapping();
        String uri = RequestUtils.getUri(request);
        String reqMethod = request.getMethod().toLowerCase();
        Queue<String> queue = new LinkedList<>(Arrays.asList(uri.split("/")));
        String namespace = queue.poll();
		if(namespace.length() == 0){
			namespace = queue.poll();
		}
		map.setName("action");
        map.setNamespace(namespace);
		return map;
		
	}
}
