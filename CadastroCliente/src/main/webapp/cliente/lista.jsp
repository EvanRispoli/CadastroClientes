<%@page import="infnet.model.domain.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description"
	content="TP1 da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
<meta name="author" content="Evan Rispoli">
<link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
<title>Cadastro de Dados</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>


	<%
	List<Cliente> clientes = (List<Cliente>) request.getAttribute("listaClientes");
	%>

	<form class="form" action="cliente" method="post">
		<div class="text-center">
			<img class="text-center" src="img/Infnet-Logo.png" alt="" width="80"
				height="80">
			<h1 class="h3 font-weight-normal Text-left">Cadastro de Clientes</h1>
			<p>Dynamic Web Project - Servlets</p>
			<a href="cliente">Novo Cliente</a>

		</div>
		<div>
			<hr>
			<h5>
				Listagem de Clientes(<%=clientes.size()%>);
			</h5>


			<table class="table table-striped">
				<thead>

					<tr>

						<th>#</th>
						<th>Nome</th>
						<th>Endereço</th>
						<th>Telefone</th>
						<th>E-mail</th>
					</tr>
				</thead>
				<tbody>
					<%
					for (Cliente u : clientes) {
					%>
					<tr>
						<th><%=u.getId()%></th>
						<th><%=u.getNome()%></th>
						<th><%=u.getEndereco()%></th>
						<th><%=u.getTelefone()%></th>
						<th><%=u.getEmail()%></th>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
</body>

</html>