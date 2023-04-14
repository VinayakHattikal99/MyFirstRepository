
<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("Login.jsp");
	}
	%>


  <!doctype html>
  <html lang="en">
  <head>
    <!-- Required meta tags -->
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <style type="text/css">
  
  </style>
      
  <link href="css/style1.css" rel="stylesheet"/>
  <style>
body{
background:#E1BEE7;
}
</style>
  <title>Note Taker :Home page</title>
     <%@include file="all-js.jsp" %>
  </head>
  <body>
  
  <div class="contaner">
     <%@include file="navbar.jsp" %>
  </div>
  
  <section class="section1">
  <div class="card text-light" style="border-radius: 25px;height:600px; width:100%;allign:center;">
						<div class="card-body p-md-15">
							<div class="row justify-content-center">
 
  <img class="img-fluid mx-auto" style="height:400px;padding:2px 2px" src="img/images.png">
  
  </div>
  <h1 class="text-primary text-uppercase text-center mt-3">Start taking your Notes</h1>
  </div>
  <div class="contaner text-center">
  <button class="btn btn-outline-primary text-center">Start</button></div>
  </div>
  </div>
  
 
</section>
  </body>
  </html>
