<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livro de OCA, Ruby, PHP e muito mais - Casa do Código</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body class="container">
	<h1>Form JSP</h1>
	<form action="/casadocodigo/produtos/add" method="post">
		<div class="form-group">
			<label>Título:</label> <input class="form-control col-sm-2"
				type="text" name="titulo" required="true" />
		</div>
		<div class="form-group">
			<label>Descrição:</label> <input class="form-control col-sm-2"
				type="text" name="descricao" />
		</div>
		<div class="form-group">
			<label>Páginas:</label> <input class="form-control col-sm-2"
				type="number" name="pagina" />
		</div>
		<button type="submit" class="btn btn-primary">Cadastrar</button>

	</form>
</body>
</html>