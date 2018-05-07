<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="static/styles/style.css">
<%@include file="tmp/header.jsp"%>

<div class="production_Page">
    <h1>Production Page!!!</h1>
</div>
<c:forEach items="${products}" var="product">
    <a href="/produtct-${product.id}">${product.productName}</a><<br>
</c:forEach>

<%@include file="tmp/footer.jsp"%>