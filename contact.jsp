<%-- 
    Document   : contact
    Created on : 16-Feb-2021, 1:08:30 PM
    Author     : Mohammad Tauheed
--%>

<%@page import="com.sap.projectsap.model.SAPModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sap.projectsap.controller.SAPController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
        <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <hr>
        <h3>Contact Us and give some suggestions by filling our form</h3>
        <div class="card mb-3 text-white border-primary">
            <div class="card-body">
                <form action ="SAPController"method="GET">
                    <input type="hidden"name="action"value="insert"/>
                    <div class="card-text">
                        <input class="form-control"type="text"name="name"placeholder="Enter your name">
                    </div>
                    <div class="card-text">
                        <input class="form-control"type="email"name="email"placeholder="Enter your email">
                    </div>
                    <div class="card-text">
                        <textarea class="form-control"name="textarea"placeholder="Enter your respective suggesstions"></textarea>
                    </div>
                    <input type="submit"value="Submit"name="submit"class="btn btn-primary">
                </form>
            </div>
        </div>
        <%= request.getParameter("message")%>
        <hr>
        <div class="row-md-3">
            <address>
                Written by <a href="mailto:tauheed1patel@gmail.com">tauheed Patel</a><br>
                Search us as:<br>
                hypercare Technology pvt. ltd.<br>
                Contact Info :<br>
                Shoeb Ali : 8765986221<br>
                Razi Ali : 333322255<br>
                Address :<br> 
                273, Gandhi Chowk Rd,<br>
                Sadar, Nagpur,<br>
                Maharashtra - 440001
            </address>
        </div>
        <hr>
       
        <%
            SAPController controller = new SAPController();
            ArrayList<SAPModel> sap = controller.findall();
        %>
        <main class="container">
            <div class="bg-light p-5 rounded">
                <table class="table table-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Sap Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email Id</th>
                        <th scope="col">Context</th>
                        <th scope="col">Deleted</th>
                        <th scope="col">Created At</th>
                        <th scope="col">Action</th>
                    </tr>

                    <%
                        if (sap.isEmpty()) {
                    %>
                    <tr class="text-center">
                        <th scope="row"colspan="8">No Data Found</th>
                    </tr>
                    <%
                    } else {
                        for (SAPModel sapm : sap) {
                    %>
                    <tr>
                        <td scope="row">
                            <%=sapm.getId()%>
                        </td>
                        <td><%=sapm.getSapId()%></td>
                        <td><%=sapm.getName()%></td>
                        <td><%=sapm.getEmail()%></td>
                        <td><%=sapm.getTextarea()%></td>
                        <td><%=sapm.getIsDeleted()%></td>
                        <td><%=sapm.getCreate_at()%></td>
                        <td colspan="2">
                            <a href="SAPController?action=delete&sap_id=<%= sapm.getSapId()%>"class="btn btn-outline-danger">Delete</a>
                            <a href="update_details.jsp?sapId=<%= sapm.getSapId()%>"class="btn btn-outline-success">Update</a>
                        </td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </table>
            </div>
        </main>
    </body>
</html>
