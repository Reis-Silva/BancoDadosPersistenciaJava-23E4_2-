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
            <h2>Cadastramento de Frutas</h2>

            <form action="/fruta/incluir" method="post">

                <c:import url="/WEB-INF/jsp/produto/cadastro.jsp"/>

                <div class="mb-3 mt-3">
                    <label for="peso">Tamanho:</label>
                    <input type="number" step="0.001" class="form-control" value="1" id="peso" placeholder="Entre com o Peso" name="peso" required>
                </div>

                <div class="form-check">
                    <label class="form-check-label">Pacote</label>
                    <input class="form-check-input" type="checkbox" name="pacote" value="true" checked>
                </div>

                <div class="mb-3 mt-3">
                    <label>Validade:</label>
                    <input type="datetime-local" class="form-control" name="validade" required>
                </div>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>