<%@ page import="br.com.igocoelho.gamers.User" %>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
		<g:javascript library="jquery"/>
		<r:require modules="bootstrap"/>
	</head>
	<body>

	<g:form method="post" class="form-horizontal">
		<g:hiddenField name="id" value="${userInstance?.id}" />
		<g:hiddenField name="version" value="${userInstance?.version}" />
		<fieldset>
		<legend><g:message code="default.create.label" args="[entityName]" /></legend>
		
		<g:render template="form"/>

		<div class="form-actions">
			<g:actionSubmit class="btn btn-primary" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
			<g:link action="list" class="btn">
				<g:message code="default.button.cancel.label" />
			</g:link>
			<g:actionSubmit class="btn btn-danger" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" formnovalidate="" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
		</div>
		</fieldset>
	</g:form>

	</body>
</html>
