import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddCookieServer", value = "/addcookie")
public class AddCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("car", "AudiA4");
        Cookie cookie2 = new Cookie("year", "2017");
        Cookie cookie3 = new Cookie("type", "Sport");
        Cookie cookie4 = new Cookie("engine", "1.8TFSI");
        Cookie cookie5 = new Cookie("color", "White");

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);
        resp.addCookie(cookie4);
        resp.addCookie(cookie5);

    }

    public static class ShowFormServlet {
    }
}
