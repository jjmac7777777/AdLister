import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

    @WebServlet(name = "PickColorServlet", value = "/pickcolor")
    public class PickColorServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/pickColor.jsp").forward(request,response);
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String userPickedColor = request.getParameter("usersColor");

            response.sendRedirect("/show-color?usersColor=" + userPickedColor);

        }
    }

