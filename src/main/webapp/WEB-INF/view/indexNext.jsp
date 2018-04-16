<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>


<form:form action="/saveUser" method="post" modelAttribute="eUser" enctype="multipart/form-data">
    <form:input path="username"/>
    <form:errors path="username"/>
    <form:input path="password"/>
    <form:errors path="password"/>
    <input type="file" name="userImageX">
    <input type="submit">
</form:form>


<%@include file="tmp/footer.jsp"%>