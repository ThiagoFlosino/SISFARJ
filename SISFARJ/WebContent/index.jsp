<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>SISFARJ - INICIO</title>
</head>
<body>
	<div class="container">
	
		<%@ include file="title.html" %>
		<div class="row" id="conteudo">
		<form action="Associacao" method="post">
			<div class="col s12">
				<h2>Cadastrar Associação</h2>
				<div class="row">
			        <div class="input-field col s6">
			          <input name="nome" type="text" class="validate">
			          <label for="first_name">Nome</label>
			        </div>
			        <div class="input-field col s6">
			          <input name="sigla" type="text" class="validate">
			          <label for="last_name">Sigla</label>
			        </div>
			      </div>
			      <div class="row">
			      	<div class="input-field col s8">
			          <input name="endereco" type="text" class="validate">
			          <label for="last_name">Endereço</label>
			        </div>
			        <div class="input-field col s4">
			          <input name="telefone" type="text" class="validate">
			          <label for="last_name">Telefone</label>
			        </div>
			      </div>			      
			      <div class="row">
			        <div class="input-field col s4">
			          <input name="numOficio" type="text" class="validate">
			          <label for="disabled">Número Ofício</label>
			        </div>
			        <div class="input-field col s4">
			          <input name="data" type="text" class="validate">
			          <label for="disabled">Data Ofício</label>
			        </div>
			        <div class="input-field col s4">
			          <input name="numComprovante" type="text" class="validate">
			          <label for="disabled">Número Comprovante</label>
			        </div>
			      </div>
			      <div class="row">
			        <div class="input-field col s4">
			          <input name="password" type="password" class="validate">
			          <label for="password">Password</label>
			        </div>
			      </div>
			      <input type="submit" value="Cadastrar" />
			</div>
	      </form>
		</div>
	</div>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>