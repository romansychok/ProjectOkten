<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../tmp/header.jsp"%>

<h3>Hekk</h3>


<c:forEach items="${countries}" var="country">
    <a href="/country-${country.id}">${country.countryName}</a><br>
    <a href="/countryUpdate/${country.id}">update</a>
</c:forEach>



<%@include file="../tmp/footer.jsp"%>