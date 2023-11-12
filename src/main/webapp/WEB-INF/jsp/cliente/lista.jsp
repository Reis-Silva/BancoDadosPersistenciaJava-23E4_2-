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
        <c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

        <div class="container-fluid mt-3">
            <h3>Listagem de Clientes:</h3>
            <h4><a href="/cliente/cadastro">Novo Cliente</a></h4>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>E-mail</th>
                        <th>Usuário</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="s" items="${listagemCliente}">
                        <tr>
                            <td>${s.id}</td>
                            <td>${s.nome}</td>
                            <td>${s.cpf}</td>
                            <td>${s.email}</td>
                            <td>${s.usuario.nome}</td>
                            <td><a href="/cliente/excluir/${s.id}/">excluir</a> </td>
                            <td><a href="/cliente/buscar/${s.cpf}/">editar</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>