<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista dos usuário Maldivas Travel</title>
</head>
<body>

  <%@ page import="model.DAO, model.usuario, java.util.*"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  	
  	<h1>USUÁRIOS CADASTRADOS NO MALDIVAS TRAVEL </h1>
  	
  	<%
  List <DAO> list = DAO.getAllusuario();
  request.setAttribute("list", list);
  	%>
  	
  	<table>
  	<tr><th>idcliente</th><th>nome</th><th>email</th><th>senha</th><th>destino_interesse</th></tr>
  	</table>
  	
</body>
</html>