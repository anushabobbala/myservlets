// DemoFilter2.java
package com.neoapp.web;

import java.io.*;
import javax.servlet.*;

public class DemoFilter2 implements Filter {
	public void init(FilterConfig config) throws ServletException {
		// init code here if any
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws ServletException, IOException {
		System.out.println("DemoFilter-2");
		chain.doFilter(req, resp);
	}

	public void destroy() {
		// Clean up code here if any
	}
}
