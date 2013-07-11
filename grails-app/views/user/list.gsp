<%@ page import="br.com.igocoelho.gamers.User" %>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<g:javascript library="jquery"/>
		<r:require modules="bootstrap"/>
	</head>
	<body>

	<div class="title">
		<h3><g:message code="default.list.label" args="[entityName]" /></h3>
		<g:link action="create" class="btn">
			<g:message code="default.create.label" args="[entityName]" />
		</g:link>
	</div>

	<table class="table table-striped">
		<thead>
			<tr>
				<td><b><g:message code="user.name.label" /></b></td>
				<td><b><g:message code="user.login.label" /></b></td>
				<td><b><g:message code="user.email.label" /></b></td>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${userInstanceList}" var="userInstance">
			<tr>
				<td>
					${fieldValue(bean: userInstance, field: "name")}&nbsp;
					<a target="_blank" href="${fieldValue(bean: userInstance, field: "facebook")}">
						<img src="${resource(dir: 'images', file: 'icon-facebook.png')}">
					</a>&nbsp;
					<a target="_blank" href="${fieldValue(bean: userInstance, field: "twitter")}">
						<img src="${resource(dir: 'images', file: 'icon-twitter.png')}">
					</a>
				</td>
				<td>${fieldValue(bean: userInstance, field: "login")}</td>
				<td>${fieldValue(bean: userInstance, field: "email")}</td>
				<td class="cmdcolumn">
        			<g:link action="edit" id="${userInstance.id}">
        				<i class="icon-edit" title="${message(code:'default.button.edit.label')}"></i>
        			</g:link>
					&nbsp;
        			<g:link action="delete" id="${userInstance.id}">
        				<i class="icon-remove" title="${message(code:'default.button.delete.label')}"></i>
        			</g:link>
      			</td>
			</tr>
			</g:each>
		</tbody>
	</table>

	<div class="pagination">
		<g:paginate total="${userInstanceTotal}" />
	</div>

	</body>
</html>