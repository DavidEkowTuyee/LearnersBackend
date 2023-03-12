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

import com.service.StudentService;

/**
 * Servlet implementation class ClassController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// retrieve product details 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	StudentService ps = new StudentService();
	List<Student> listOfStudent = ps.findAllStudent();
//	pw.println("Number of product are "+listOfProduct.size());
//	Iterator<Product> ii = listOfProduct.iterator();
//	while(ii.hasNext()) {
//		Product p = ii.next();
//		pw.println("<div>");
//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
//		pw.println("<span>Pid is "+p.getPid()+" PName is "+p.getPname()+"</span>");
//		pw.println("</div>");
//	}
	request.setAttribute("listOfStudent", listOfStudent);
	RequestDispatcher rd = request.getRequestDispatcher("student-list.jsp");
	rd.include(request, response);
	
	}

	// store product details 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		String sname = request.getParameter("sname");
		
		
		
		Student s = new Student();
		s.setName(sname);
//		s.setId(sid);
//	
		
		StudentService ps = new StudentService();
		String result  = ps.addStudent(s);
		
		List<Student> result2 = ps.findAllStudent();
//		pw.println(result);
//		System.out.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add-student-form.jsp");
		rd.include(request, response);
		doGet(request, response);
		
	}

}
