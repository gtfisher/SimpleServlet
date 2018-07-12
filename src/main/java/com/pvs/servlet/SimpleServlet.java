package com.pvs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -4751096228274971485L;
	
	private static final Logger LOGGER = LogManager.getLogger(SimpleServlet.class);
    

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
				LOGGER.info("Servlet " + this.getServletName() + " get called");
		response.getWriter().println("Hello World!");
	}

	@Override
	public void init() throws ServletException {
		LOGGER.info("Servlet " + this.getServletName() + " has started");
	}

	@Override
	public void destroy() {
		LOGGER.info("Servlet " + this.getServletName() + " has stopped");
	}

}