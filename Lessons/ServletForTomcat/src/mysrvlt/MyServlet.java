package mysrvlt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/16/13
 * Time: 2:06 PM
 * This is my first class to try Servlets on Tomcat
 */
public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");

        String title = "hello world";

        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

        // note that all links are created to be relative. this
        // ensures that we can move the web application that this
        // servlet belongs to to a different place in the url
        // tree and not have any harmful side effects.

        // XXX
        // making these absolute till we work out the
        // addition of a PathInfo issue

        out.println("<a href=\"../helloworld.html\">");
        out.println("<img src=\"../images/code.gif\" height=24 " +
                "width=24 align=right border=0 alt=\"view code\"></a>");
        out.println("<a href=\"../index.html\">");
        out.println("<img src=\"../images/return.gif\" height=24 " +
                "width=24 align=right border=0 alt=\"return\"></a>");
        out.println("<h1>" + title + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
