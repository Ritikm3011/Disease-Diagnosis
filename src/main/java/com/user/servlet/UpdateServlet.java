package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.FactoryProvider;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
		HttpSession session = request.getSession();

		int prescriptionId = Integer.parseInt(request.getParameter("prescriptionId"));
		String name = request.getParameter("name");
		String data = request.getParameter("data");

		response.getWriter().print("\n\n\n" + data + name + prescriptionId);

		boolean f = dao.updatePrescriptionData(prescriptionId, data);
		response.getWriter().print("\n\n\n" + f);
		
		if (f) {
			session.setAttribute("successMsg", "Scanned Successfully");
			response.sendRedirect("final.jsp?prescriptionId="+prescriptionId);

		} else {
			session.setAttribute("failMsg", "Someting went wrong");
			response.sendRedirect("final.jsp?prescriptionId="+prescriptionId);

		}
		
	}

}
