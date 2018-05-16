<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="tmp/header.jsp"/>


<div class="indexPage">
    <h1>Index page</h1>
</div>
<br>

<div class="container">
    <div class="page-header">
        <h1 class="title_position">Test project (Overview)</h1>
    </div>
    <br>
    <p class="lead">Test 1: Product <a href="/products">Products</a>and <a href="/users">Users</a>
    </p>

    <br>
    <p class="lead">Test 2: <a href="/users">show Users</a> </p>

    <div class="page-header">
        <table id="users">
            <thead>
            <tr>
                <th class="disabled-sorting">#</th>
                <th>Name</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="users">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <br>
    <p class="lead">Test 3: <a href="/categories>">Show categories</a> </p>
    <div class="lead">
        <tbody>
        <c:forEach items="${categories}" var="category">
            <tr>
                <td>${category.id}</td>
                <td>${category.categoryOfProduct}</td>
            </tr>
        </c:forEach>
        </tbody>
    </div>
    <br>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">This button do nothing</button>
        </div>
    </div>
    <br>

</div>

<jsp:include page="tmp/footer.jsp"/>