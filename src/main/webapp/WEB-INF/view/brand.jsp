<%@include file="tmp/header.jsp"%>

brand page
<form action="/saveBrand" method="post" enctype="multipart/form-data">
    <input type="text" name="brandName" placeholder="brand">
    <input type="file" name="brandImage">
    <input type="submit" value="save">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>

<%@include file="tmp/footer.jsp"%>