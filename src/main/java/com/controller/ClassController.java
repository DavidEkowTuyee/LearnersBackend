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

import com.entity.Class;

import com.service.ClassService;

/**
 * Servlet implementation class ClassController
 */
@WebServlet("/ClassController")
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// retrieve product details 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	ClassService ps = new ClassService();
	List<Class> listOfClass = ps.findAllClass();
//	pw.println("Number of product are "+listOfProduct.size());
//	Iterator<Product> ii = listOfProduct.iterator();
//	while(ii.hasNext()) {
//		Product p = ii.next();
//		pw.println("<div>");
//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
//		pw.println("<span>Pid is "+p.getPid()+" PName is "+p.getPname()+"</span>");
//		pw.println("</div>");
//	}
	request.setAttribute("listOfClass", listOfClass);
	RequestDispatcher rd = request.getRequestDispatcher("class-list.jsp");
	rd.include(request, response);
	
	}

	// store product details 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		String cname = request.getParameter("cname");
		int cid = Integer.parseInt(request.getParameter("cid"));
		
		
		Class p = new Class();
		p.setCname(cname);
		p.setCid(cid);
		
		
		ClassService ps = new ClassService();
		String result  = ps.addClass(p);
		
		List<Class> result2 = ps.findAllClass();
//		pw.println(result);
//		System.out.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add-class-form.jsp");
		rd.include(request, response);
		doGet(request, response);
		
	}

}