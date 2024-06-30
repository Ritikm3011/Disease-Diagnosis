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
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String blood_group = request.getParameter("blood_group");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		User user = new User(name, email, phone, dob, blood_group, gender, password, address);
		
		UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
		
		HttpSession session = request.getSession();
		
		
		if (dao.signUp(user)) {
			session.setAttribute("successMsg", "Register Successfully");
			response.sendRedirect("log_in.jsp");

		} else {
			session.setAttribute("failMsg", "Someting went wrong");
			response.sendRedirect("sign_up.jsp");
			
		}
	}

}
