package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Register;

import FactoryHelper.FactoryProvider;


public class SaveRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			String name= request.getParameter("name");
			//String phno= request.getParameter("phno");
			String email= request.getParameter("email");
			String pass= request.getParameter("password");
			String r_pass =request.getParameter("rep_password");
			
			
			Register register=new Register(name, email, pass, r_pass);
			
			//Register register1=new Register(name, phno, pass, r_pass);
			
			
			Session session=FactoryProvider.getFactory().openSession();
			Transaction tx=session.beginTransaction();
			session.save(register);
			//session.save(register1);
			tx.commit();
			session.close();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1 style='text-align:center;color:red;'>Registration is Successful..</h1>");
			out.println("<h1 style='text-align:center;'><a href='Login.jsp'"
					+ "style='text-decoration:none'>"
					+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">login</button></h1>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}

}
