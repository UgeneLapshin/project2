<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 19.04.15
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/js/bootstrapValidator.min.js" type="text/javascript"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<%--<script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>--%>

<script src="http://code.jquery.com/jquery-1.11.1.js"></script>
<script src="../js/account.js"></script>
<html>
<head>
    <title>Account Page</title>
</head>
<body>
<div class="container">
    <h1>Accounts base</h1>

<div style="margin-left: -60px; width: 65%; margin-top: 20px;">
<form class="form-horizontal"
      data-fv-framework="bootstrap"
      data-fv-icon-valid="glyphicon glyphicon-ok"
      data-fv-icon-invalid="glyphicon glyphicon-remove"
      data-fv-icon-validating="glyphicon glyphicon-refresh">
    <div class="form-group">
        <label class="col-sm-2 control-label">First Name:</label>
        <div class="col-sm-10">
            <input type="text" required
                   data-fv-notempty-message data-fv-notempty="true" name="firstName" id="firstName"
                   class="form-control" placeholder="Enter your First Name">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Last Name:</label>
        <div class="col-sm-10">
            <input type="text" required
                   data-fv-notempty-message data-fv-notempty="true"
                   name="lastName" id="lastName" class="form-control" placeholder="Enter your Last Name">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Email:</label>

        <div class="col-sm-10">
            <input type="text" required
                   data-fv-notempty-message
                   data-fv-notempty="true" name="email" id="email" class="form-control" placeholder="Enter your Email">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Password:</label>

        <div class="col-sm-10">
            <input type="text" required
                   data-fv-notempty-message data-fv-notempty="true"
                   name="password" id="password" class="form-control" placeholder="Enter your Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" id="addAccount" class="btn btn-success">Create</button>
            <%--<input type="submit" value="Create" id="addAccount" class="btn btn-success">--%>
        </div>
    </div>
</form>
</div>

    <div style="margin-left: 67%; margin-top: -25%; position: absolute;">
        <img src="http://imgs.abduzeedo.com/files/articles/logo-design-eyes/3d2873b52ece650a679cce744021dd83.png" class="img-rounded">
    </div>

<div id="info-content">

    <div id="showAllAccount">
        <table class="table table-hover">
            <thead>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Edit account</th>
            </thead>
            <c:forEach var="accounts" items="${accounts}">
                <tr>
                    <td>${accounts.id}</td>
                    <td>${accounts.firstName}</td>
                    <td>${accounts.lastName}</td>
                    <td>${accounts.email}</td>
                    <td>${accounts.password}</td>
                    <td>
                        <button data-id="${account.id}" class="btn btn-info">Edit</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>


</div>
</div>
</body>
</html>
