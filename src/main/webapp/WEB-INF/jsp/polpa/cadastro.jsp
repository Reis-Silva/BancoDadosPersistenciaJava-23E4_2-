<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>AppPedido</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-3">
            <h2>Cadastramento de Bebidas</h2>

            <form action="/fruta/incluir" method="post">

                <c:import url="/WEB-INF/jsp/produto/cadastro.jsp"/>

                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="congelado" value="true" checked>
                    <label class="form-check-label">Congelado</label>
                </div>

                <div class="mb-3 mt-3">
                    <label for="quantidade">Quantidade:</label>
                    <input type="number" step="0.001" class="form-control" value="1" id="quantidade" placeholder="Entre com a Quantidade" name="quantidade">
                </div>

                <div class="mb-3 mt-3">
                    <label for="informacoes">Informações:</label>
                    <input type="text" class="form-control" value="informacoes" id="informacoes" placeholder="Entre com a sua Informação" name="informacoes">
                </div>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>