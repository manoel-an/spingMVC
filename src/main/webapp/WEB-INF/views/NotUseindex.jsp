<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo de uma aplicação web</title>
        <style type="text/css">
            <%@include file="/css/stylesheet.css" %>
        </style>
    </head>
    <body>
		<h3>
			<a href="hello?name=Manoel">Click here...</a>
		</h3>
		<h3>
			<a href="produtoSalvoViewRP?name=Macarrao">Click here...Produto = Macarrao</a>
		</h3>	    
        <br><br>
        <a href="clienteFormView.htm" class="hiperlink">Formulário de cadastro de Cliente da seção</a>
        <br/>
        <a href="produtoFormView.htm" class="hiperlink">Formulário de cadastro de Produto</a>
        <br><br><br><br>
        <a href="clienteFormView/dois" class="hiperlink">Formulário de cadastro de Cliente com valor 2</a>
        <br><br>
        <a href="clienteFormView/outro" class="hiperlink">Formulário de cadastro de Cliente limpo</a>
    </body>
</html>
