<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../tmp/header.jsp"%>


<br>
<%--<form:form modelAttribute="countryAttribute" method="POST" action="/countryUpdate">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="id">Id</form:label></td>--%>
            <%--<td><form:input path="id" disabled="true"/></td>--%>
        <%--</tr>--%>

        <%--<tr>--%>
            <%--<td><form:label path="countryName">Name</form:label></td>--%>
            <%--<td><form:input path="countryName"/></td>--%>
        <%--</tr>--%>

    <%--</table>--%>
    <%--<input type="submit" value="Save" />--%>
<%--</form:form>--%>

<form:form action="/countryUpdate"  method="post" modelAttribute="countryAttribute" >
    <td><form:label path="countryName">Name</form:label></td>
    <td><form:input path="countryName"/></td>
    <input type="submit" value="SAVE">

</form:form>



<%@include file="../tmp/footer.jsp"%>