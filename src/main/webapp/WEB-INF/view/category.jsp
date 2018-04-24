<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tmp/header.jsp"%>

Category
<br>
<form:form action="/saveCategory" method="post" modelAttribute="eCategory"  >
    <form:input path="categoryOfProduct"/>
    <form:errors path="categoryOfProduct"/>
    <input type="submit" value="save">



</form:form>
<%--<form action="/saveCategory" method="post">--%>
    <%--<input type="text" name="category" placeholder="category">--%>
    <%--<input type="submit" value="save">--%>
    <%--<input type="hidden"--%>
           <%--name="${_csrf.parameterName}"--%>
           <%--value="${_csrf.token}"/>--%>
<%--</form>--%>
<br>
<a href="/categories">All categories</a>
<%@include file="tmp/footer.jsp"%>