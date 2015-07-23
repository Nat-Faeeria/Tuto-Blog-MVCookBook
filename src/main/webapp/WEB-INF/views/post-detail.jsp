<%--
  Created by IntelliJ IDEA.
  User: dev
  Date: 23/07/15
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${post.title}</title>
</head>
<body>

    <h1>${post.title}</h1>
    <p>${post.author}</p>
    <p id="post-content">${post.content}</p>
    <p class="small-date">Created&nbsp;on&nbsp;${post.creationDate},&nbsp;Last&nbsp;updated&nbsp;on&nbsp${post.updateDate}</p>
    <div>
        <c:forEach items="${post.comments}" var="comment">
            <p class="comment"><c:out value="${comment}"/></p>
        </c:forEach>
    </div>
</body>
</html>
