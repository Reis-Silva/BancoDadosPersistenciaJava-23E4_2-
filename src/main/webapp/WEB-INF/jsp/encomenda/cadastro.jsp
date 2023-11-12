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
            <h2>Cadastramento de Encomenda</h2>

            <form action="/encomenda/incluir" method="post">

                <c:import url="/WEB-INF/jsp/produto/cadastro.jsp"/>

                <div class="mb-3 mt-3">
                    <label for="quantidade">Quantidade:</label>
                    <input type="number" step="0.001" class="form-control" value="1" id="quantidade" placeholder="Entre com a Quantidade" name="quantidade" required>
                </div>

                <div class="mb-3 mt-3">
                    <label>Data:</label>
                    <input type="datetime-local" class="form-control" name="dataPossivelEntrega" required>
                </div>

                <div class="mb-3 mt-3">
                    <label for="informacoesExtras">Validade:</label>
                    <input type="text" class="form-control" value="informacoesExtras" id="informacoesExtras" placeholder="Entre com as Informacões Extras" name="informacoesExtras">
                </div>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>