import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

    @WebServlet(name = "ShowColorServlet", value = "/show-color")
    public class ShowColorServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String usersColor = request.getParameter("usersColor");
            request.setAttribute("color",usersColor);

            request.getRequestDispatcher("/showColor.jsp").forward(request,response);

        }

    }

