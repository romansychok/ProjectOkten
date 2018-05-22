<%@include file="tmp/header.jsp"%>

User page
<br>
<hr>
<h1>Hello, ${user.username}</h1>
<br>
<br>
<br>
<img class="userPhoto" src="${user.userImage}" alt="${user.username}">

<%@include file="tmp/footer.jsp"%>