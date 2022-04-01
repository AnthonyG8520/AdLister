import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PizzaServlet",  urlPatterns = "/pizza")
public class PizzaServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] toppings = request.getParameterValues("quiz_question_1");

        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("sauce"));
        System.out.println(request.getParameter("size"));
        System.out.println(request.getParameter("address"));
        for(String topping : toppings){
            System.out.println(topping);
        }


        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}
