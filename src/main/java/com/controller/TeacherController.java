package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.entity.Teacher;

import com.service.TeacherService;

/**
 * Servlet implementation class ClassController
 */
@WebServlet("/TeacherController")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// retrieve product details 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	TeacherService ps = new TeacherService();
	List<Teacher> listOfTeacher = ps.findAllTeacher();
//	pw.println("Number of product are "+listOfProduct.size());
//	Iterator<Product> ii = listOfProduct.iterator();
//	while(ii.hasNext()) {
//		Product p = ii.next();
//		pw.println("<div>");
//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
//		pw.println("<span>Pid is "+p.getPid()+" PName is "+p.getPname()+"</span>");
//		pw.println("</div>");
//	}
	request.setAttribute("listOfTeacher", listOfTeacher);
	RequestDispatcher rd = request.getRequestDispatcher("teacher-list.jsp");
	rd.include(request, response);
	
	}

	// store product details 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		
		
		String tname = request.getParameter("tname");
		int tid = Integer.parseInt(request.getParameter("tid"));
		
		
		
//		Teacher p = new Teacher();
//		p.setTname(tname);
//		p.setTid(tid);
//		
		
		
		TeacherService ps = new TeacherService();
//		String result  = ps.addTeacher(p);
		
		List<Teacher> result2 = ps.findAllTeacher();
//		pw.println(result);
//		System.out.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add-teacher-form.jsp");
		rd.include(request, response);
		doGet(request, response);
		
	}

}