import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "WrongGuessServlet", value = "/incorrect")
public class WrongGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("usrAnswer", "Incorrect");

        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

}