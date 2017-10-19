package vn.com.oNddleo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.com.oNddleo.model.User;
import vn.com.oNddleo.service.UserService;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet(name = "Login", urlPatterns = { "/Login" })
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ArrayList<String> props = new ArrayList<>();
		props.add(username);
		props.add(password);
		User user = new User(props);
		try {
			if(UserService.checkLogin(user)) {
				HttpSession session = request.getSession(true);
				int iduser = UserService.getUserByID(username);
		        session.setAttribute("iduser",iduser); 
		        RequestDispatcher rd = request.getRequestDispatcher("home");
				rd.forward(request, response);
			}
			else {
				response.sendRedirect("error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
