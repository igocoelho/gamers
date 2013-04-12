<%@ page import="br.com.igocoelho.gamers.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<g:javascript library="jquery"/>
		<r:require modules="bootstrap"/>
	</head>
	<body>

	<h3><g:message code="default.list.label" args="[entityName]" /></h3>

	<g:if test="${flash.message}">
	<div class="message" role="status">${flash.message}</div>
	</g:if>

	<table class="table table-striped">
		<thead>
			<tr>
				<td><g:message code="user.name.label" /></td>
				<td><g:message code="user.login.label" /></td>
				<td><g:message code="user.email.label" /></td>
				<td><g:message code="user.facebook.label" /></td>
				<td><g:message code="user.twitter.label" /></td>
			</tr>
		</thead>
		<tbody>
			<g:each in="${userInstanceList}" var="userInstance">
			<tr>
				<td>${fieldValue(bean: userInstance, field: "name")}</td>
				<td>${fieldValue(bean: userInstance, field: "login")}</td>
				<td>${fieldValue(bean: userInstance, field: "email")}</td>
				<td>${fieldValue(bean: userInstance, field: "facebook")}</td>
				<td>${fieldValue(bean: userInstance, field: "twitter")}</td>
			</tr>
			</g:each>
		</tbody>
	</table>

	<div class="pagination">
		<g:paginate total="${userInstanceTotal}" />
	</div>

	</body>
</html>