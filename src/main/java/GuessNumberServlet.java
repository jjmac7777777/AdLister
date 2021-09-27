import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessNumberServlet", value = "/guess-number")
public class GuessNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userResult = request.getParameter("result");

        request.setAttribute("usrAnswer",userResult);

        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

}
