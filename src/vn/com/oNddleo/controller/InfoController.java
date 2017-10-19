package vn.com.oNddleo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import vn.com.oNddleo.model.Information;
import vn.com.oNddleo.service.InfomationService;

/**
 * Servlet implementation class InfoController
 */
@WebServlet("/InfoController")
public class InfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoController() {
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
	    int iduser = (int) request.getSession().getAttribute("iduser");
	    String name = request.getParameter("name");
	    int age = Integer.parseInt(request.getParameter("age"));
	    String work = request.getParameter("work");
	    String favorite = request.getParameter("favorite");
	    String archivements = request.getParameter("archivements");
	    String research = request.getParameter("research");
	    
	    ArrayList<Object> props = new ArrayList<>();
	    props.add(iduser);
	    props.add(name);
	    props.add(age);
	    props.add(work);
	    props.add(favorite);
	    props.add(archivements);
	    props.add(research);
	    
	    Information info = new Information(props);
		InfomationService.addInformation(info);
		String json = "{\"addInfoSucc\": true}";
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	}

}
