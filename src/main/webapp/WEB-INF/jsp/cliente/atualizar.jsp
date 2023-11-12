<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>Atualização de Cliente</title>
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"/>

        <div class="container mt-3">

            <h2>Cliente</h2>
            <form action="/cliente/atualizar" method="post">
                <div class="form-group">
                    <label>Nome:</label>
                    <input type="text" value="${{cliente.nome}}" class="form-control" placeholder="Entre com o seu nome" name="nome">
                </div>
                <div class="form-group">
                    <label>E-mail:</label>
                    <input type="email" value="${{cliente.email}}" class="form-control" placeholder="Entre com o seu e-mail" name="email">
                </div>

                <button type="submit" class="btn btn-default">Atualizar</button>
            </form>
        </div>
    </body>
</html>