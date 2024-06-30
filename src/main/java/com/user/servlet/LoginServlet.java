package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.FactoryProvider;
import com.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
//		doGet(request, response);
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
		HttpSession session = request.getSession();
		
		User user = dao.login(email, password);
		
		if (user == null) {
			session.setAttribute("failMsg", "Invalid email & password");
			response.sendRedirect("log_in.jsp");

		} else {
			session.setAttribute("userObj", user);
			response.sendRedirect("user_home.jsp");

		}
		
		
	}

}
