<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../tmp/header.jsp"%>

Country
<br>
<%--<<form action="/saveCountry" method="post">--%>
    <%--<input type="text" name="countryName" placeholder="countryName">--%>
    <%--<input type="submit">--%>
<%--<input type="hidden"--%>
       <%--name="${_csrf.parameterName}"--%>
       <%--value="${_csrf.token}"/>--%>

<%--</form>--%>

<form:form action="/saveCountry" method="post" modelAttribute="eCountry">
    <form:input path="countryName"/>
    <form:errors path="countryName"/>
    <input type="submit">
</form:form>
<c:forEach items="${countries}" var="country">
    ${country.countryName}<br>
</c:forEach>

<%@include file="../tmp/footer.jsp"%>