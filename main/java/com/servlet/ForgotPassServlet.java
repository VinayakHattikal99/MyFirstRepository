package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Register;

import FactoryHelper.FactoryProvider;

public class ForgotPassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ForgotPassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String password= request.getParameter("password");
			String password1= request.getParameter("rep_password");
			
			int registerId=Integer.parseInt(request.getParameter("registerId").trim());
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			
			Register register=s.get(Register.class, registerId);
			register.setPassword(password);
			register.setRep_pasword(password1);
			tx.commit();
			s.close();
			
			response.sendRedirect("Register.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
