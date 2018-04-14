<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>

Index page
<br>
<br>
<br>
<br>
<form  action="/save" method="post"  enctype="multipart/form-data">
    <input type="text" name="username" placeholder="name">
    <input type="password" name="password" placeholder="password">
    <input type="file" name="userImage" placeholder="userImage">
    <input type="submit" value="save">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>
<br>
<a href="/loginUp">sf form</a>
<br>
<a href="/login">log in</a>
<br>
<a href="/users">users page</a>
<br>
<a href="/category">category</a>
<br>
<a href="/product">product</a>
<br>
<a href="/country">country</a>
<br>
<a href="/brand">brand</a>
<br>
<br>
<br>
<br>
<a href="/indexNext">Next</a>
<%@include file="tmp/footer.jsp"%>