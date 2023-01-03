<%-- 
    Document   : update_details
    Created on : 23-Feb-2021, 9:49:39 PM
    Author     : Mohammad Tauheed
--%>

<%@page import="com.sap.projectsap.model.SAPModel"%>
<%@page import="com.sap.projectsap.controller.SAPController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <h1>Update Details</h1>
        <%
            SAPController controller = new SAPController();
            SAPModel sapmodel = controller.findBySAPId(request.getParameter("sapId"));

            if (sapmodel == null) {
        %>
        No User Found with provided Id
        <%
        } else {
            out.print(sapmodel.getSapId());
        %>
        <div class="card mb-3 text-white border-primary">
            <div class="card-body">
                <form action ="SAPController" method="get">
                    <input type="hidden"name="sap_id"value="<%= sapmodel.getSapId()%>"/>
                    <input type="hidden"name="action"value="update"/>
                    <div class="card-text">
                        <input class="form-control"type="text"value="<%=sapmodel.getName()%>"name="name"placeholder="Enter your name">
                    </div>
                    <div class="card-text">
                        <input class="form-control"type="email"value="<%=sapmodel.getEmail()%>"name="email"placeholder="Enter your email">
                    </div>
                    <div class="card-text">
                        <textarea class="form-control"name="textarea"placeholder="Enter your respective suggesstions"><%=sapmodel.getTextarea()%></textarea>
                    </div>
                    <input type="submit"value="Update"class="btn btn-primary">
                </form>
            </div>
        </div>
        <%
            }
        %>
    </body>
</html>
