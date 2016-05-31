<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/styles.css">
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="js/script.js"></script>
<link rel="icon" type="image/png" href="favicon-32x32.png" />
<link rel="icon" type="image/png" href="favicon-16x16.png" />
<title>Clinica - HomePage</title>
</head>
<body>
	<div>
		<img alt="logoClinica" src="Clinica.gif">
	</div>
	<div id='cssmenu'>
		<ul>
			<li class='active'><a href='HomePage.jsp'>Home</a></li>
			<li><a href='AreaAdmin.jsp'>Area Admin</a></li>
			<li><a href='AreaPazienti.jsp'>Area Pazienti</a></li>
			<li><a href='doveSiamo.jsp'>Dove siamo</a></li>
			<li><a href='chiSiamo.jsp'>Chi siamo</a></li>
			<li><a href='ElencoTipologieEsami.jsp'>Mostra Tipologie Di Esami</a></li>
		</ul>
	</div>
	<div>Username:<h:inputText value="#{AdminController.username}"/></div>
	<div>Password:<h1:inputText value="#{AdminController.password}"/></div>
	