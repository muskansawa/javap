import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class HelloServlet extends HttpServlet{

public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException

{
System.out.println("----service------");
PrintWriter out = response.getWriter();
//ServletOutputStream sos = response.getOutputStream();
out.println("Welcome to Servlet : "+ new Date());
out.close();//
}

}