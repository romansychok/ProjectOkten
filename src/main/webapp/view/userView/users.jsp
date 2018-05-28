<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../tmp/header.jsp"%>

All users page
<br>
<c:forEach items="${users}" var="user">
    <a href="/user-${user.id}">${user.username}</a><br>
</c:forEach>

<%--<c:forEach items="${products}" var="product">--%>
    <%--${product.productName}--%>
<%--</c:forEach>--%>

<%@include file="../tmp/footer.jsp"%>