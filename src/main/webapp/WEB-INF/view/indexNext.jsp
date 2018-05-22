<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>


<h3>Registration</h3>
<div class="registrationForm">
<form:form action="/saveUser" method="post" modelAttribute="eUser" enctype="multipart/form-data">
        <br>
    <div class="userNameForm">
        <td><form:label path="username">Name</form:label></td>
        <td><form:input path="username"/></td>
        <td><form:errors path="username"/></td>
    </div>
    <br>
    <div class="userPasswordForm">
        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <form:errors path="password"/>
    </div>
    <br>
    <div class="repeatPasswordForm">
    <form:label path="repeatPassword">repeatPassword</form:label>
    <form:input path="repeatPassword"/>
    <form:errors path="repeatPassword"/>
    </div>
    <br>
    <br>
    <td>
        <input type="file" name="userImageX">
        <br>
        <td colspan="2"> <input type="submit"> </td>
    </tr>
</form:form>
</div>

<%@include file="tmp/footer.jsp"%>