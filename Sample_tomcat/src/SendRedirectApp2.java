

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/SendRedirectApp2")
public class SendRedirectApp2 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();

      out.println("<h1> Validation Success! </h1>");
      out.println("<a href='SendRedirectClient1.html'>Back</a>");
      out.close();
    }
}