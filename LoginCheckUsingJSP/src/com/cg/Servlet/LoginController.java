package com.cg.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name=request.getParameter("txtName");
		String password=request.getParameter("txtpassword");

	
		if((name.equals("admin")) &&(password.equals("admin")))
		{
			 HttpSession session=request.getSession();
			 session.setAttribute("txtName", name);
			response.sendRedirect("Success.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");	
		}
	}

}
