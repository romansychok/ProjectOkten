<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>

Product details
<form action="/saveProduct" method="post">
    <input type="text" name="productName" placeholder="productName">
    <input type="text" name="nameOfBrand" placeholder="nameOfBrand">
    <input type="text" name="description" placeholder="description">
    <input type="text" name="price" placeholder="price">
    <input type="text" name="quantity" placeholder="quantity">
    <input type="text" name="pathImage" placeholder="pathImage">
    <input type="submit" value="save">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>
<%--<form:form modelAttribute="saveProduct" method="post"--%>

<%@include file="tmp/footer.jsp"%>