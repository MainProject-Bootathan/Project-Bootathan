

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/practice_servelt_4")
public class practice_servelt_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("uname");
		String s2=request.getParameter("upass");
		
		if(s1.equals("Mugundhan") && s2.equals("Srmv"))
		{
			response.sendRedirect("http://localhost:8080/Sample_tomcat/practice_servelt_2");
			
		}
		else
		{
			response.sendRedirect("http://localhost:8080/Sample_tomcat/Practice_Html.html");
		}
//		  response.setContentType("text/html");
//	      PrintWriter out=response.getWriter();
//
//	      String user=request.getParameter("uname");
//	      String pass=request.getParameter("upass");
//
//	      if(user.equals("gopi")&&pass.equals("m"))
//	      {
//	          response.sendRedirect("http://localhost:8080/Sample_tomcat/practice_servelt_3");
//	      }
//	      else
//	      {
//	          response.sendRedirect("http://localhost:8080/Sample_tomcat/Practice_Html.html");
//	      }


	      out.close();
		
	}

}
