<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="TP1 da disciplina Desenvolvimento Web com Java EE ministrada pelo professo Elberth Moraes">
    <meta name="author" content="Evan Rispoli">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
    <title>Login</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>

  <body>
  
  	<%
  		String mensagem = (String)request.getAttribute("msg");
  		//"A combinação entre o utilizador e a senha está incorreta";
  	
  	%>
      <form class="form-signin" action="acesso" method="post">
      <div class="text-center mb-4">
        <img class="mb-4" src="img/Infnet-Logo.png" alt="" width="80" height="80">
        <h6 class="h5 mb-12 font-weight-normal">Sistema de cadastro de clientes </h6>
        
        <%if(mensagem != null){%>
        	<div class="alert alert-warning">
        		<strong>Oops!!</strong><p><%=mensagem %></p>
        	</div>
        <%}%>
        
        <p>  Desenvolvimento Web com Java EE </p>
      </div>

      <div class="form-label-group">
        <input type="email" id="inputEmail" name="email" value="evan@rispoli.com"class="form-control" placeholder="Adress Courriel" required autofocus>
        <label for="inputEmail">Email </label>
      </div>

      <div class="form-label-group">
        <input type="password" id="inputPassword" name="senha" value="evan@rispoli.com"class="form-control" placeholder="Mot de passe" required>
        <label for="inputPassword">Senha</label>
      </div>

      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      <p class="mt-5 mb-3 text-muted text-center">&copy; 08-11-2021</p>
    </form>
  </body>
  
</html>