package com.user.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.UserDao;
import com.db.FactoryProvider;
import com.entity.PrescriptionData;
import com.helper.DateTime;

/**
 * Servlet implementation class UploadServlet1
 */

@MultipartConfig
public class UploadServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet1() {
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

		UserDao dao = new UserDao(FactoryProvider.getSessionFactory());
		HttpSession session = request.getSession();

		Part part = request.getPart("img");
		String imgName = part.getSubmittedFileName();

		int userId = Integer.parseInt(request.getParameter("userId"));
		String userName = request.getParameter("name");
		String uploadDateTime = DateTime.getDateTime();
		String prescriptionData = dao.scanner(imgName);

		String uploadPath = "C:/Users/ritik/OneDrive/Documents/projects/DiseaseDiagnosis/src/main/webapp/image/"
				+ imgName;

		response.getWriter().print(imgName + "\n" + uploadPath + "\n" + userId + "\n" + userName + "\n" + uploadDateTime
				+ "\n" + prescriptionData);

		try {
			FileOutputStream fos = new FileOutputStream(uploadPath);
			InputStream is = part.getInputStream();

			byte[] data = new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		PrescriptionData prescData = new PrescriptionData(userId, userName, imgName, uploadDateTime, prescriptionData);

		
		Integer pId = dao.storeResult(prescData);
		if (pId != 0) {
			session.setAttribute("successMsg", "Uploaded Successfully");
			response.sendRedirect("success.jsp?prescriptionId="+pId);

		} else {
			session.setAttribute("failMsg", "Someting went wrong");
			response.sendRedirect("success.jsp");

		}

	}

}
