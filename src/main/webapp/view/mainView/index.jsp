<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../tmp/header.jsp"%>

<div class="boxIndex">

    <div class="access">
        <a  class="registrationAccess" href="/indexNext">Registration</a>
        <a href="/login">Authorization</a>
    </div>

<div class="header">
    <%--<img src="https://www.webpagefx.com/blog/web-design/logotypewordmark-logos-30-creative-examples/">--%>

        <%--<p class="indexPage">Index page</p>--%>

</div>

<br>
        <div class="menu">
            <a class="active" href="/products">Products</a>
            <a href="/users">Users</a>
            <a href="/categories>">Categories</a>
            <a href="/indexNext">Registration</a>
            <a href="/category">Category</a>
            <a href="/product">product</a>
        </div>

    <br>
    <div class="left">
        <li><a href="/users">users</a> </li>
    </div>




</div>

<%@include file="../tmp/footer.jsp"%>