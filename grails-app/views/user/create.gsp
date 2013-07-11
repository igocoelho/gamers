<%@ page import="br.com.igocoelho.gamers.User" %>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
		<g:javascript library="jquery"/>
		<r:require modules="bootstrap"/>
	</head>
	<body>

	<g:form action="save" class="form-horizontal">
		<fieldset>
		<legend><g:message code="default.create.label" args="[entityName]" /></legend>
		
		<g:render template="form"/>
		
		<div class="form-actions">
			<g:submitButton name="create" class="btn btn-primary" value="${message(code: 'default.button.create.label', default: 'Create')}" />
			<g:link action="list" class="btn">
				<g:message code="default.button.cancel.label" />
			</g:link>
		</div>	
		</fieldset>
	</g:form>

	</body>
</html>