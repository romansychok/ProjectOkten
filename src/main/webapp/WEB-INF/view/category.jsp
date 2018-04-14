<%@include file="tmp/header.jsp"%>

Category
<form action="/saveCategory" method="post">
    <input type="text" name="category" placeholder="category">
    <input type="submit" value="save">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>

<%@include file="tmp/footer.jsp"%>