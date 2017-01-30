// SessionActiveTimeListener.java
package com.neoapp.web;

import javax.servlet.*;
import javax.servlet.http.*;

public class SessionActiveTimeListener implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent se) {

	}

	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		long creation = session.getCreationTime();
		long lastAccess = session.getLastAccessedTime();

		long sessionInMillis = lastAccess - creation;
		long sessionSeconds = sessionInMillis / 1000;

		ServletContext sc = session.getServletContext();
		sc.log("Session Acive time = " + sessionSeconds + " seconds");
	}
}
