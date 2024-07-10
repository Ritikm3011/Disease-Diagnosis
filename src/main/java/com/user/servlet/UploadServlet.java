package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.UserDao;
import com.db.FactoryProvider;
import com.entity.Result;
import com.helper.DateTime;

/**
 * Servlet implementation class UploadServlet
 */
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
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
//		int userId =Integer.parseInt(request.getParameter("userId"));
		int userId =12;
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String blood_group = request.getParameter("blood_group");
		String medication = request.getParameter("medication");
		String taking_medication = request.getParameter("taking_medication");
		String diagnose = request.getParameter("diagnose");
		String symptoms1 = request.getParameter("symptoms1");
		String symptoms2 = request.getParameter("symptoms2");
		String symptoms3 = request.getParameter("symptoms3");
		String symptoms4 = request.getParameter("symptoms4");
		String symptoms5 = request.getParameter("symptoms5");
		String symptoms6 = request.getParameter("symptoms6");
		String resultx = "Pending..";
		String dateTime = DateTime.getDateTime();
		
		Part filePart = request.getPart("imageFile");
		String imageName = filePart.getSubmittedFileName();
		
		System.out.println(imageName);
		
		
		response.getWriter().print(name+"\t"+gender+"\t"+diagnose+"\t"+taking_medication);
		response.getWriter().println(symptoms1+"\t"+symptoms2+"\t"+symptoms3+"\t"+symptoms4+"\t"+symptoms5+"\t"+symptoms6);
		
		Result result = new Result(userId, name, gender, dob, blood_group, medication, taking_medication, diagnose, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, symptoms6, resultx, dateTime);
				UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
		HttpSession session = request.getSession();
		
//		if (dao.storeResult(result)) {
//			session.setAttribute("successMsg", "Uploaded Successfully");
//			response.sendRedirect("success.jsp");
//
//		} else {
//			session.setAttribute("failMsg", "Someting went wrong");
//			response.sendRedirect("success.jsp");
//			
//		}
		
		
		
		
//		response.sendRedirect("success.jsp");
		
		
		
	}

}
