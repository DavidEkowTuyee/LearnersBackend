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

import com.entity.Subject;

import com.service.SubjectService;

/**
 * Servlet implementation class ClassController
 */
@WebServlet("/SubjectController")
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// retrieve product details 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	SubjectService ps = new SubjectService();
	List<Subject> listOfSubject = ps.findAllSubject();
//	pw.println("Number of product are "+listOfProduct.size());
//	Iterator<Product> ii = listOfProduct.iterator();
//	while(ii.hasNext()) {
//		Product p = ii.next();
//		pw.println("<div>");
//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
//		pw.println("<span>Pid is "+p.getPid()+" PName is "+p.getPname()+"</span>");
//		pw.println("</div>");
//	}
	request.setAttribute("listOfSubject", listOfSubject);
	RequestDispatcher rd = request.getRequestDispatcher("subject-list.jsp");
	rd.include(request, response);
	
	}

	// store product details 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		String subname = request.getParameter("subname");
		int subid = Integer.parseInt(request.getParameter("subid"));
		
		
		Subject p = new Subject();
		p.setSubname(subname);
		p.setSubid(subid);
		
		
		SubjectService ps = new SubjectService();
		String result  = ps.addSubject(p);
		
		List<Subject> result2 = ps.findAllSubject();
//		pw.println(result);
//		System.out.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add-subject-form.jsp");
		rd.include(request, response);
		doGet(request, response);
		
	}

}