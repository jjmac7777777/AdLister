import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RightGuessServlet", value = "/correct")
public class RightGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("usrAnswer", "Correct");

        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

}