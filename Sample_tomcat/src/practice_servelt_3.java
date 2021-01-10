

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/practice_servelt_3")
public class practice_servelt_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	 public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("uname");
		String s2=request.getParameter("upass");
		
		if(s1.equals("Mugundhan") && s2.equals("Srmv"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/practice_servelt_2");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Practice_Html.html");
			rd.forward(request, response);
				
		}
	}

}
