package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.model.Register;
import bank.model.RegisterDao;
import bank.model.RegisterDaoImpl;

/**
 * Servlet implementation class DisplayAllController
 */
@WebServlet("/DisplayAllController")
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterDao rdao=new RegisterDaoImpl();
		List<Register> lstallrecord=rdao.displayAll();
		
		PrintWriter pw=response.getWriter();
		pw.println("<table border='3px' bgcolor='blue'>");
		
		pw.println("<table border='3' style='background-color: blue; width: 100%; border-collapse: collapse;'>");

		// Header row with inline CSS styles
		pw.println("<tr style='color: white; background-color: darkblue;'>");
		pw.println("<th style='padding: 8px; border: 1px solid white;'>Account Number</th>");
		pw.println("<th style='padding: 8px; border: 1px solid white;'>Account Name</th>");
		pw.println("<th style='padding: 8px; border: 1px solid white;'>Account Balance</th>");
		pw.println("</tr>");

		for (Register robj : lstallrecord) {
		    // Each data row with inline CSS styles
		    pw.println("<tr>");
		    pw.println("<td style='padding: 8px; border: 1px solid white;'>" + robj.getAccnumber() + "</td>");
		    pw.println("<td style='padding: 8px; border: 1px solid white;'>" + robj.getAccFname() + "</td>");
		    pw.println("<td style='padding: 8px; border: 1px solid white;'>" + robj.getAccBal() + "</td>");
		    pw.println("</tr>");
		}
		pw.println("</table>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
