<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PlanGo Game list</title>
</head>
<body>
   <c:if test="${not empty gamelist}">
   
      <ul>
         <c:forEach var="game" items="${gamelist}">
            <li><a href="${game.launchUrl}" target="_blank">${game.type} - ${game.gameId} - ${game.gid} - ${game.description}</a></li>
         </c:forEach>
      </ul>

   </c:if>
</body>
</html>