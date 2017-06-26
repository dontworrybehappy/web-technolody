package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		int max=-100;
		int[ ][ ] x = new int[ 5 ][ 8 ];
		for (int i = 0; i < x.length; i++) { 
			for(int j = 0; j < x[i].length; j++) {
			x[i][j]=((int)(Math.random()*199)-99);
			 if(max<x[i][j]){
				 max=x[i][j];
			 }
			 resp.getWriter().print(x[i][j]+" "); 
			}
			resp.getWriter().print("<br>");
	}
		resp.getWriter().print("максимальный элемент:"+max);
	}
}
