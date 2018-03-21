import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("car", "AudiA3");
        req.getRequestDispatcher("home.jsp").forward(req, resp);

        HttpSession session = req.getSession();
        session.setAttribute("skoczek", "Adam Malysz");

    }
}
