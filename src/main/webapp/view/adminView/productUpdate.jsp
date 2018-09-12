<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../tmp/header.jsp"%>

Product update
<br>
<form:form action="/updateProduct" method="post" modelAttribute="eProductUpdate" enctype="multipart/form-data">
        <form:input path="productName" placeholder="productName"/>
        <form:input path="nameOfBrand" placeholder="nameOfBrand"/>
        <form:input path="description" placeholder="description"/>
        <form:input path="price" placeholder="price"/>
        <form:input path="quantity" placeholder="quantity"/>
        <input type="file" name="pathImage">
        <input type="submit">
</form:form>

    <%@include file="../tmp/footer.jsp"%>