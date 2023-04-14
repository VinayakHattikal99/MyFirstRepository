<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
     <%@include file="all-js.jsp" %>
     <link href="css/style1.css" rel="stylesheet"/>
     <style>
body{
background:#E1BEE7;
}
</style>
</head>
<body>
<div class="contaner">
  <%@include file="navbar.jsp" %>
  <br>
   <form action="SaveNoteServlet" method="post">
  <div class="form-group row px-5">
    <label for="input" class="col-sm-2 col-form-label">Note Title :</label>
    <textarea name="title1" 
    required id="input" placeholder="Enter title here"
    class="form-control"
    style="height:50px" 
    ></textarea>
  </div>
  <div class="form-group row px-5">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Note content :</label>
    <textarea name="content1"
    required id="inputPassword3" placeholder="Enter your content here"
    class="form-control"
    style="height:200px" 
    ></textarea>
  </div>
   <div class="contaner text-center">
      <button class="btn btn-outline-dark my-2 my-sm-0" type="submit">Save</button>
    </div>
  </div>
  </form>
  </div>
</body>
</html>