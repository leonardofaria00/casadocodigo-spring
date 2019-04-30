<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro de OCA, Ruby, PHP e muito mais - Casa do Código</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
</head>
<body class="container">
	<div class="">
		<h1>Listando Livros</h1>
	</div>
	<hr>
	<table class="table">
		<thead class="thead-dark">
			<tr class="text-center">
				<th scope="col">Código</th>
				<th scope="col">Título</th>
				<th scope="col">Descrição</th>
				<th scope="col">Páginas</th>
				<th scope="col">Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${livros}" var="livro">
				<tr class="text-center">
					<th scope="row">${livro.id}</th>
					<td>${livro.titulo}</td>
					<td>${livro.descricao}</td>
					<td>${livro.pagina}</td>
					<td>
						<a href="#"><i class="fas fa-pen"></i></a>
						<a href="#"><i class="fas fa-trash-alt"></i></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>