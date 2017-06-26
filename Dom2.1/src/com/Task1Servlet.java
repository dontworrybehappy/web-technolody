package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8"); 
		String var1 = req.getParameter("var1");
		float x = Float.parseFloat(var1);
		String var2 = req.getParameter("var2");
	    float y = Float.parseFloat(var2);
				
	        if(x>10&y>10){
	        	 if(10-x>10-y){
	        		resp.getWriter().println("Ближайшее к 10 число:"+x);
	             		}
	             else {
	            	 resp.getWriter().println("Ближайшее к 10 число:"+y);
	             }
	        }
	        else{
	        	if(10-x>10-y){
	        		 resp.getWriter().println("Ближайшее к 10 число:"+y);
	             	        }
	             else {
	            	 resp.getWriter().println("Ближайшее к 10 число:"+x);
	             }
	        }
	}
}
