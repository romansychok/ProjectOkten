<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<%@include file="tmp/footer.jsp"%>