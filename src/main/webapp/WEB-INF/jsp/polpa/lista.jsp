<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>appgestaoterrenofrutas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"/>

        <div class="container-fluid mt-3">
            <h3>Listagem de Polpas:</h3>
            <h4><a href="/polpa/cadastro">Nova Polpa</a></h4>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Valor</th>
                        <th>Código</th>
                        <th>Congelado</th>
                        <th>Quantidade</th>
                        <th>Informacões</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="p" items="${listaPolpa}">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.descricao}</td>
                            <td>${p.valor}</td>
                            <td>${p.codigo}</td>
                            <td>${p.congelado}</td>
                            <td>${p.quantidade}</td>
                            <td>${p.informacoes}</td>
                            <td><a href="/polpa/excluir/${p.id}">Excluir</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>