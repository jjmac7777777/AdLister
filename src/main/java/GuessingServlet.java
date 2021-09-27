import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingServlet", value = "/guess-attempt")
public class GuessingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess-attempt.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int usersGuessedNumber = Integer.parseInt(request.getParameter("guessed_number"));

        Random random = new Random();

        int min = 1;
        int max = 10;

        int randomInt = random.nextInt(max - min + 1) + min;

        if (randomInt == usersGuessedNumber){

            response.sendRedirect("/correct");

        }else{
            response.sendRedirect("/incorrect");


        }

    }
}
