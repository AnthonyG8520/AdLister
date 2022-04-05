import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "viewguess", urlPatterns = "/guess")
public class ViewGuess extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        request.getRequestDispatcher("guess-num.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String answer = request.getParameter("answer");
        request.setAttribute("answer", answer);
        if(answer.equals("2")){
            response.sendRedirect("/correct?answer=correct");
        }else if(answer.equals("1") || answer.equals("3")){
            response.sendRedirect("/incorrect?answer=incorrect");
        }else{
            response.sendRedirect("/guess");
        }

    }
}
