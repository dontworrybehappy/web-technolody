package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Task3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int[ ][ ] x = new int[ 8 ][ 5 ];
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
			x[i][j]=((int)(Math.random()*90)+10);
			resp.getWriter().print(x[i][j]+" "); 
			}
			resp.getWriter().print("<br>");
	}
	}
}
