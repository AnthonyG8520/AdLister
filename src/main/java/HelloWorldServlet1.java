import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet1", urlPatterns = "/hello")
public class HelloWorldServlet1 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String output = "<h1>Hello, World!</h1>";
        if(request.getParameter("name") != null){
            output = "Hello, " + request.getParameter("name") + "!";
        }
        PrintWriter out = response.getWriter();
        out.println(output);
    }
}

