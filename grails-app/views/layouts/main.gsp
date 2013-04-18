<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Gamers - <g:layoutTitle default="Welcome"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.gif')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		<style type="text/css">
			body {
				padding-top: 40px;
				padding-bottom: 40px;
			}
			.container-narrow {
				margin: 0 auto;
				max-width: 700px;
			}
			.container-narrow > hr {
				margin: 30px 0;
			}
	    </style>
		<g:layoutHead/>
		<r:layoutResources />
	</head>
	<body>

    <div class="navbar navbar-fixed-top">
    	<div class="navbar-inner">
    		<div class="container">
    			<ul class="nav">
    				<li class="dropdown">
    					<a class="dropdown-toggle" data-toggle="dropdown" href="#">Administration<b class="caret"></b></a>
    					<ul class="dropdown-menu">
    						<li><g:link controller="user" action="list">Users</g:link></li>
    						<li><a href="#">Consoles</a></li>
    						<li><a href="#">Games</a></li>
    					</ul>
    				</li>
    				<li><a href="#">Activity</a></li>
    				<li><a href="#">Games</a></li>
    				<li><a href="#">Gamers</a></li>
    			</ul>

				<form class="navbar-search pull-left">
					<input type="text" class="search-query" placeholder="Search">
				</form>
    		</div>
    	</div>
    </div>

	<div class="container-narrow">
		<g:layoutBody/>

		<div class="footer">
			<hr /><p>&copy; Company 2013</p>
		</div>
	</div>

	<g:javascript library="application"/>
	<r:layoutResources />

	</body>
</html>