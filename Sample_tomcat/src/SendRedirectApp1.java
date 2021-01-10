

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class SendRedirectApp1
 */
@WebServlet("/SendRedirectApp1")
public class SendRedirectApp1 extends HttpServlet {
	 public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	    {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();

	      String user=request.getParameter("uname");
	      String pass=request.getParameter("pass");

	      if(user.equals("gopi")&&pass.equals("m"))
	      {//http://localhost:8080/Sample_tomcat/SendRedirectClient1.html
	          response.sendRedirect("http://localhost:8080/Sample_tomcat/SendRedirectApp2");
	      }
	      else
	      {
	          response.sendRedirect("http://localhost:8080/Sample_tomcat/SendRedirectClient1.html");
	      }


	      out.close();
	    }

}
