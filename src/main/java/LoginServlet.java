import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("UserName");
        String password = request.getParameter("password");
        String requestMethodType = request.getMethod();

        if (requestMethodType.equals("POST")) {
            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("/profile.jsp");
            } else {
                response.sendRedirect("/login&error=true");
            }
        }
    }
}
