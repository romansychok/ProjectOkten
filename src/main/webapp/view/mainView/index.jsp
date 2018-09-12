<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../tmp/header.jsp"%>

<div class="boxIndex">
    <div class="access">
        <p class="contact">+380954202454</p>
        <p class="contact2">romansychok@gmail.com</p>
        <a class="registrationAccess" href="/indexNext">Registration</a>
        <a href="/login">Authorization</a>
    </div>

<div class="header">
    <%--<img src="https://www.webpagefx.com/blog/web-design/logotypewordmark-logos-30-creative-examples/">--%>

        <%--<p class="indexPage">Index page</p>--%>

</div>

<br>
        <div class="menu">
            <a class="active" href="/productsAdmin">Products</a>
            <a href="/users">Users</a>
            <a href="/categories">Categories</a>
            <a href="/indexNext">Registration</a>
            <a href="/categoryAdmin">Category</a>
            <a href="/productAdmin">product</a>
        </div>

    <br>
    <div class="left">
        <li><a href="/users">users</a> </li>
    </div>




</div>

<%@include file="../tmp/footer.jsp"%>