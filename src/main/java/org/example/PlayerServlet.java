package org.example;

import javax.servlet.ServletException;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
//        PrintWriter writer =  response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>" +
//                "<title>Player</title>" +
//                "</head>");
//
//        writer.println("<body>" +
//                "<h1> Welcome to Player Application</h1>" +
//                "</body");
//        writer.println("</html");

        String playerName = request.getParameter("name");
        System.out.println("Player name is: "+playerName);
        request.setAttribute("jspPlayerName", playerName);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,response);
    }

    private PlayerService service = new PlayerService();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {

        String playerName = request.getParameter("name");
        System.out.println("Player name is: "+playerName);

        Player player = service.getPlayerByName(playerName);
        request.setAttribute("player_Name", playerName);
        request.setAttribute("player_Age", player.getAge());
        request.setAttribute("player_Nationality", player.getNationality());
        request.setAttribute("player_Id", player.getId());





//        request.setAttribute("jsp_info_PlayerName", playerName);
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request,response);
    }


}