<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>

<h3>Registration</h3>
<div class="container">
<form:form action="/saveUser" method="post" modelAttribute="eUser" enctype="multipart/form-data">
    <tr>
        <br>
        <td><form:label path="username">Name</form:label></td>
        <td><form:input path="username"/></td>
        <td><form:errors path="username"/></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password"/></td>
        <td><form:errors path="password"/></td>
    </tr>
    <td>
        <input type="file" name="userImageX">
        <td colspan="2"> <input type="submit"> </td>
    </tr>
</form:form>
</div>

<%@include file="tmp/footer.jsp"%>