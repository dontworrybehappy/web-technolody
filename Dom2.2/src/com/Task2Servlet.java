package com;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html;charset=UTF-8"); 
		
		String var1 = req.getParameter("var1");
		int a = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		int b = Integer.parseInt(var2);
		String var3 = req.getParameter("var3");
		int c = Integer.parseInt(var3);
		
		
        double d=b*b-4*a*c;
        if (d>=0){
        	double x1=(-b+Math.sqrt(d))/2*a;
			double x2=(-b-Math.sqrt(d))/2*a;
			resp.getWriter().println(x1+" "+x2);
		        }
        else{
        	resp.getWriter().println("Корней нет");
        }
	}
}
