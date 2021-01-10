import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/practice_servelt_1")
public class practice_servelt_1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/Html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("uname");
		String s2=request.getParameter("upass");
		
		out.println("<h1>Username:"+s1+"</h1>");
		out.println("<h1>Password:"+s2+"</h1>");
		
		out.println("<a href='Practice_Html.html'>Back</a>");
		
	}



}
