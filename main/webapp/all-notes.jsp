<%@page import="com.entities.*"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.query.QueryLogging_$logger"%>
<%@page import="FactoryHelper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>all notes: Note Taker</title>
<%@include file="all-js.jsp"%>
<link href="css/style1.css" rel="stylesheet"/>
<style>
body{
background:#E1BEE7;
}
</style>
</head>
<body>
	<div class="contaner">
		<%@include file="navbar.jsp"%>
	</div>
	<h1 class="text-uppercase">All Notes</h1>


	<div class="row">
		<div class="col-12">
			<%
			Session s = FactoryProvider.getFactory().openSession();

			Query q = s.createQuery("from Note");  //h query longuage
			List<Note> list = q.list();

			for (Note note : list) {
			%>

			<div class="card mt-3">
				<img class="card-img-top m-4 mx-auto" style="max-width: 100px;"
					src="img/post-it.png" alt="Card image cap">
				<div class="card-body px-5">
					<h5 class="card-title"><%=note.getTitle()%></h5>
					<p class="card-text"><%=note.getContent()%></p>
					<p class="card-date"><%=note.getAdddate()%></p>
					<div class="contaner text-center">
						<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a> 
						<a href="Update.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>

					</div>
				</div>
			</div>


			<%
			}

			s.close();
			%>

		</div>

	</div>

</body>
</html>