<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page  language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>appgestaoterrenofrutas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

        <div class="container-fluid mt-3">
            <h3>Listagem de Produtos:</h3>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descrição</th>
                        <th>Valor</th>
                        <th>Código</th>
                        <th>Pedidos</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="f" items="${listaProduto}">
                        <tr>
                            <td>${f.id}</td>
                            <td>${f.descricao}</td>
                            <td>${f.valor}</td>
                            <td>${f.codigo}</td>
                            <td>${f.pedidos.size()}</td>
                            <td><a href="/produto/excluir/${f.id}">excluir</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>