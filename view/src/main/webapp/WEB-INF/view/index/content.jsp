<%--
  Created by IntelliJ IDEA.
  User: denis_zavadsky
  Date: 4/4/15
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<div class="form-container">
    <form id="createProduct">
    <label>Title: <input type="text" name="title"></label>
    <label>Description:<input type="text" name="description"></label>
    <label>Price:<input type="text" name="price"></label>
    <label>Quantity:<input type="text" name="quantity"></label>
        <input type="button" id="create" value="Create">
    </form>

</div>
<div class="index-container">
    <table>
        <thead>
        <th>Id</th>
        <th>Title</th>
        <th>Description</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Create products</th>
        </thead>
        <c:forEach var="product" items="${product}">
            <tr>
                <td>${product.id}</td>
                <td>${product.title}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>
                    <button class="edit-product" data-id="${product.id}" data-product-name="${product.title}">Create</button>
                </td>
            </tr>
        </c:forEach>
    </table>

    <div id="section">

    </div>
</div>
<div id="popup-wrapper" class="easy-modal"></div>