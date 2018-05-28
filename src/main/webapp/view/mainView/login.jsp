<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../tmp/header.jsp"%>


login page
<br>
<c:url var="xxx" value="/login"/>
<form action="${xxx}" method="post">
    <c:if test="${param.error!=null}">
        <p>error</p>
    </c:if>
    <c:if test="${param.logout!=null}">
        <p>Very good</p>
    </c:if>
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit" value="login">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>



<%@include file="../tmp/footer.jsp"%>