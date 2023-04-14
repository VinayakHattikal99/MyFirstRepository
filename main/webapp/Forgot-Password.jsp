<%@page import="com.entities.Register"%>
<%@page import="FactoryHelper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot password</title>
<%@include file="all-js.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
  <br>
  <h1>Please change Password</h1>
  <br>
 
  <%
  int registerId = Integer.parseInt(request.getParameter("registerId").trim());
  Session s = FactoryProvider.getFactory().openSession();
		Register register = (Register)s.get(Register.class, registerId);
  %>
  
  <form class="mx-1 mx-md-4" action="SaveRegistration" method="post">
   <input value="<%=register.getId() %>" name="noteId" type="hidden"/>
   
         <div class="d-flex flex-row align-items-center mb-4">
		<i class="fas fa-lock fa-lg me-3 fa-fw"></i>
		<div name="password" class="form-outline flex-fill mb-0">
			<input name="password" type="password" id="form3Example4c"
			class="form-control" placeholder="Password" /> 
			    <%=register.getPassword() %>
			</div>
			
			<div name="re_password" class="form-outline flex-fill mb-0">
			<input name="re_password" type="password" id="form3Example4c"
			class="form-control" placeholder="Re_Password" /> 
			    <%=register.getRep_pasword() %>
			</div>
			
			<div class="contaner text-center">
      <button type="submit" class="btn btn-success" >Save</button>
    </div>
		</div>
</form>
</body>
</html>