package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import bank.model.Login;
import bank.model.RegisterDaoImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		Login lobj=new Login(userName,password);
		List<Login> lstlogin=new ArrayList<Login>();
		lstlogin.add(lobj);
		
		RegisterDaoImpl rdao=new RegisterDaoImpl();
		boolean b=rdao.validateUser(lstlogin);
		
		if(b) {
			response.sendRedirect("Dashboard.html");
			}
		else {
			response.sendRedirect("Error.html"); 
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
