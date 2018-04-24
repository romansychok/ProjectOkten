<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>

Product details

<form:form action="/saveProduct" method="post" modelAttribute="eProduct" enctype="multipart/form-data">
    <form:input path="productName"/>
    <form:input path="nameOfBrand"/>
    <form:input path="description"/>
    <form:input path="price"/>
    <form:input path="quantity"/>
    <form:select path="category" items="${category}" itemLabel="categoryOfProduct" itemValue="id"/>
    <input type="file" name="pathImage">
    <input type="submit">



</form:form>
<%--<form:form modelAttribute="saveProduct" method="post"--%>

<%@include file="tmp/footer.jsp"%>