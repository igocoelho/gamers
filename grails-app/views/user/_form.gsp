<%@ page import="br.com.igocoelho.gamers.User" %>
	<div class="control-group">
		<label class="control-label" for="name"><g:message code="user.name.label" /></label>
		<div class="controls">
			<g:textField name="name" required="" value="${userInstance?.name}"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="login"><g:message code="user.login.label" /></label>
		<div class="controls">
			<g:textField name="login" required="" value="${userInstance?.login}"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="password"><g:message code="user.password.label" /></label>
		<div class="controls">
			<g:textField name="password" maxlength="10" required="" value="${userInstance?.password}"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="email"><g:message code="user.email.label" /></label>
		<div class="controls">
			<g:textField name="email" required="" value="${userInstance?.email}"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="facebook"><g:message code="user.facebook.label" /></label>
		<div class="controls">
			<g:textField name="facebook" required="" value="${userInstance?.facebook}"/>
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="twitter"><g:message code="user.twitter.label" /></label>
		<div class="controls">
			<g:textField name="twitter" required="" value="${userInstance?.twitter}"/>
		</div>
	</div>