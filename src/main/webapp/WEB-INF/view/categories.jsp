<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tmp/header.jsp"%>

All categories
<br>


<c:forEach items="${categories}" var="category">
    <a href="/category-${category.id}">${category.categoryOfProduct}</a><br>
</c:forEach>


<%@include file="tmp/footer.jsp"%>