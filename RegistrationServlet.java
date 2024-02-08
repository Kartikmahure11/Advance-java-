import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	         
	        request.setAttribute("name", name);
	        request.setAttribute("email", email);
	        request.setAttribute("password", password);
	        
	        

	        
	        request.getRequestDispatcher("display").forward(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
