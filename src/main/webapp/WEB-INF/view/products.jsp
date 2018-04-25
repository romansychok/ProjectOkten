<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tmp/header.jsp"%>


<c:forEach items="${products}" var="product">
    <a href="/produtct-${product.id}">${product.productName}</a><<br>
</c:forEach>

<%@include file="tmp/footer.jsp"%>