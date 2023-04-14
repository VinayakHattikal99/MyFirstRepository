package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Register;

import FactoryHelper.FactoryProvider;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String email= request.getParameter("email");
		String pass= request.getParameter("password");
		
	//	int noteId=Integer.parseInt(request.getParameter("noteId").trim());
		
		
		
		Session session=FactoryProvider.getFactory().openSession();
	//	Transaction tx=session.beginTransaction();
		
	//=======================================================================
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://127.0.0.1:3306/notetaker";
			String pass1="root";
			Connection connection=DriverManager.getConnection(url, pass1, pass1);
			String query="select email, password from registration";
			Statement stmt=connection.createStatement();
			ResultSet set =stmt.executeQuery(query);
			
			while(set.next()) {
				if(email.equals(set.getString("email")) && pass.equals(set.getString("password"))){
					out.println("<h1 style='text-align:center;color:red;'>Login is successful...!</h1>");
					out.println("<h1 style='text-align:center;'><a href='index1.jsp'"
							+ "style='text-decoration:none;color:green;'>"
							+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">go to Home</button></h1>");
				}
			
//			else {
//	
//					out.println("<h1 style='text-align:center;'>Login is fail...!</h1>");
//					
//					out.println("<h1 style='text-align:center;'><a href='Login.jsp'"
//							+ "style='text-decoration:none'>"
//							+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Re-login</button></h1>");
//			
//			}
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	//	Register register2=session.get(Register.class, noteId);
		
//		if(email.equals(register.getEmail()) && pass.equals(register.getPassword())){
//			out.println("<h1 style='text-align:center;'>Login is sucssfull...!</h1>");
//			out.println("<h1 style='text-align:center;'><a href='index.jsp'"
//					+ "style='text-decoration:none'>"
//					+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">go to Home</button></h1>");
//		}
//		else {
//			try {
//				out.println("<h1 style='text-align:center;'>Login is fail...!</h1>");
//				out.println("<h1 style='text-align:center;'><a href='Login.jsp'"
//						+ "style='text-decoration:none'>"
//						+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Re-login</button></h1>");
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.getMessage();
//			}
//		}
		out.close();
		
		
		
		
	}

}

//
//<!--        <%
//int noteid=Integer.parseInt(request.getParameter("note_id").trim());
//Session s=FactoryProvider.getFactory().openSession();
//		Register note=(Register)s.get(Register.class, noteid);
//%>  -->


//<!--     <input value="<%=note.getId() %>" name="noteId" type="hidden"/>   -->