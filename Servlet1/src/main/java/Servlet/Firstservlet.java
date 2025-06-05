package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Firstservlet
 */

//This is a Servlet annotation. It maps the URL pattern /Firstservlet to this Firstservlet class. When a 
//client makes a request to this URL
//(e.g., http://yourdomain.com/Firstservlet), this servlet will be invoked.//
@WebServlet("/Firstservlet")

//This declares a public class named Firstservlet that inherits from HttpServlet. 
//The HttpServlet class provides methods for handling HTTP requests (like GET and POST).
public class Firstservlet extends HttpServlet {
	//This is a standard practice for serializable classes in Java. Servlets can be serialized in some server environments.
	//serialVersionUID is a unique identifier for the class version, ensuring compatibility during deserialization.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//This is the constructor of the Firstservlet class.
	//It calls the constructor of its superclass (HttpServlet). 
    public Firstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Hello from Servlet!</h1>");
	        out.println("</body></html>");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//This method handles HTTP POST requests.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
