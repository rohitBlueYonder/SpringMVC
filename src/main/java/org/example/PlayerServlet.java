package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter writer =  response.getWriter();
        writer.println("<html>");
        writer.println("<head>" +
                "<title>Player</title>" +
                "</head>");

        writer.println("<body>" +
                "<h1> Welcome to Player Application</h1>" +
                "</body");
        writer.println("</html");
    }
}