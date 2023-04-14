<%@page import="com.entities.Register"%>
<%@page import="org.hibernate.Session"%>
<%@page import="FactoryHelper.FactoryProvider" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
     <%@include file="all-js.jsp" %>
     <style type="text/css">
     .divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
.h-custom {
height: calc(100% - 73px);
}
@media (max-width: 450px) {
.h-custom {
height: 100%;
}
}
     </style>
     
     <link href="css/style1.css" rel="stylesheet"/>
     <style>
body{
background:#E1BEE7;
}
</style>
</head>
<body>

 <%@include file="navbar.jsp" %>
  <br>
  
  <!-- <div class="dropdown-menu"> -->
  
  <section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
    <div class="card text-black" style="border-radius: 25px;">
						<div class="card-body p-md-5">
							<div class="row justify-content-center">
    
      <div class="col-md-9 col-lg-6 col-xl-5">
      
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form action="LoginServlet" method="post">
          
          <!-- Email input -->
          <div name="email" class="form-outline mb-4">
          <label class="form-label" for="form3Example3">Email address</label>
            <input name="email" type="email" id="form3Example3" class="form-control form-control-lg"
              placeholder="Enter a valid email address" />
            
          </div>

          <!-- Password input -->
          <div name="password" class="form-outline mb-3">
          <label class="form-label" for="form3Example4">Password</label>
            <input name="password" type="password" id="form3Example4" class="form-control form-control-lg"
              placeholder="Enter password" />
            
          </div>

          <div class="d-flex justify-content-between align-items-center">
            <!-- Checkbox -->
            <div class="form-check mb-0">
              <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
              <label class="form-check-label" for="form2Example3">
                Remember me
              </label>
            </div>
            <a href="Forgot-Password.jsp" class="text-body">Forgot password?</a>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
            <button type="submit" class="btn btn-primary btn-lg"
              style="padding-left: 2.5rem; padding-right: 2.5rem;"><a herf="index1.jsp">Login</a></button>
            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="Register.jsp"
                class="link-danger">Register</a></p>
          </div>

        </form>
        </div>
        </div>
        </div>
      </div>
    </div>
  </div>
    
</section>

</body>

</html>