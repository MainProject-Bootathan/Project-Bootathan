

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericServletApp1")
public class GenericServletApp1 extends HttpServlet {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{

	        response.setContentType("text/html");
	        PrintWriter out=response.getWriter();

	        String s1=request.getParameter("uname");
	        String s2=request.getParameter("pass");

	        out.println("<h1>"+s1+"</h1>");
	        out.println("<h1>"+s2+"</h1>");

	        out.println("<a href='GenericServletClient1.html'>Back</a>");        
	        out.close();
	    }

}
