<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../tmp/header.jsp"%>

<h1>${product.productName}</h1>
<br>
<br>
<img class="userPhoto" src="${product.pathImage}">
<p>${product.nameOfBrand}</p>
<p>${product.description}</p>
<p>${product.price}</p>
<p>${product.quantity}</p>


<%@include file="../tmp/footer.jsp"%>