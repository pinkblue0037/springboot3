<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Manage Your Todos</title>		
	</head>
	<body>

	<div class="container">
		
		<h1>Enter Todo Details</h1>
		
		<form:form method="post" modelAttribute="board">

		<fieldset class="mb-3">				
			<form:label path="title">title</form:label>
			<form:input type="text" path="title" required="required"/>
			<form:errors path="title" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="mb-3">				
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" required="required"/>
			<form:errors path="description" cssClass="text-warning"/>
		</fieldset>
		
		<form:input type="hidden" path="num"/>
		<form:input type="hidden" path="writer"/>
		<form:input type="hidden" path="date"/>
		
		<input type="submit" class="btn btn-success" />
		
		</form:form>
		
	</div>
		<script src="/META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="/META-INF/resources/webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>