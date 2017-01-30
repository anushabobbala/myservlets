// DemoFilter1.java
package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class DemoFilter1 implements Filter {
	private FilterConfig fc;

	public void init(FilterConfig config) throws ServletException {
		this.fc = config;
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws ServletException, IOException {
		System.out.println("DemoFilter-1");
		HttpServletRequest httpReq = (HttpServletRequest) req;
		String name = httpReq.getRemoteUser();
		if (name != null) {
			fc.getServletContext().log("Remote User: " + name);
		} else {
			System.out.println("Remote User: null");
		}
		chain.doFilter(req, resp);
	}

	public void destroy() {
		// Clean up code here if any
	}
}
