package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;

import FactoryHelper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			//title
			String title=request.getParameter("title1");
			String content=request.getParameter("content1");

			Note note=new Note(title,content, new Date());

			//System.out.println(note.getId()+" "+note.getTitle());

			//hibernate save
			Session session =FactoryProvider.getFactory().openSession();
			Transaction tx=session.beginTransaction();
			session.save(note);
			tx.commit();
			session.close();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1 style='text-align:center;color:red;'>Note is Saved Successfully</h1>");
			out.println("<h1 style='text-align:center;'><a href='all-notes.jsp'"
					+ "style='text-decoration:none'>"
					+ "<button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">view all notes</button></h1>");



		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
