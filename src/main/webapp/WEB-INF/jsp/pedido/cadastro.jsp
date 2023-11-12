<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>Cadastramento de Pedidos</title>
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"/>

        <div class="container mt-3">
            <h2>Pedido</h2>
            <form action="/pedido/incluir" method="post">
                <div class="form-group">
                    <label>Informações:</label>
                    <input type="text" class="form-control" placeholder="Entre com a descrição" name="informacao" required>
                </div>
                <div class="form-group">
                    <label>Data:</label>
                    <input type="datetime-local" class="form-control" name="data" required>
                </div>
                <div class="form-group">
                    <label>Tipo:</label>
                    <div class="form-check">
                        <input type="radio" class="form-check-input" name="web" value="true"> Web
                        <label class="form-check-label"></label>
                    </div>
                    <div class="form-check">
                        <input type="radio" class="form-check-input" name="web" value="false"> Loja
                        <label class="form-check-label"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label>Cliente:</label>
                    <select name="cliente" class="form-control">
                        <c:forEach var="c" items="${clientes}">
                            <option value="${c.id}">${c.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Produtos:</label>
                    <c:forEach var="p" items="${produtos}">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="produtos" value="${p.id}" >
                            <label class="form-check-label"> ${p.descricao}</label>
                        </div>
                    </c:forEach>
                </div>

                <button type="submit" class="btn btn-default">Cadastrar</button>
            </form>
        </div>
    </body>
</html>