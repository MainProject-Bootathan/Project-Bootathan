

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/practice_servelt_2")
public class practice_servelt_2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("uname");
		String s2=request.getParameter("upass");
		
		out.println("<h1> Welcome , "+s1+"</h1>");
		out.println("<a href='Practice_Html.html'>Back</a>");
		
	}


	
}
