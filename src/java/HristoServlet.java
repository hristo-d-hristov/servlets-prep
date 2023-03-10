import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HristoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String otgovor;
        if (username.equals("Hristo")) {
            otgovor = "Welcome, Admin";
        } else {
            otgovor = "Welcome, User";
        }
        response.getWriter().println(otgovor);
    }
}
