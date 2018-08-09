<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../tmp/header.jsp"%>

<h1>Hello World!!!</h1>


<c:forEach items="${cateroryPage}" var="product">
    <img class="productImage" src="${product.pathImage}">
    <a class="production_Page" href="/product-${product.id}">${product.productName}</a>
    <<br>
</c:forEach>


<%@include file="../tmp/footer.jsp"%>