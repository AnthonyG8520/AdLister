import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "FavColorServlet", urlPatterns = "/pickcolor")
public class FavColorServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        String color = request.getParameter("pickcolor");
        request.setAttribute("pickcolor", color);
        response.sendRedirect("/viewcolor?color=" + color);
    }
}
