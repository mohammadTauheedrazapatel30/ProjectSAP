<%-- 
    Document   : navbar
    Created on : 16-Feb-2021, 12:47:22 PM
    Author     : Mohammad Tauheed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <title>JSP Page</title>
        <%@include file="header.jsp"%>
    </head>
    <body>
        <nav class="navbar navbar-expand bg-primary navbar-dark">
            <a class="navbar-brand" href="index.jsp"><h1>SAP</h1></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button><br>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" href="index.jsp">HOME</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="about_us.jsp">About Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="service.jsp">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="team.jsp">Our Team</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="contact.jsp">Contact Us</a>
                    </li>
                </ul>
            </div>
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
                </form>
        </nav>
    <marquee class="text-success">"SAP" stands for "Systems, Applications & Products in Data Processing"</marquee>
</body>
</html>
