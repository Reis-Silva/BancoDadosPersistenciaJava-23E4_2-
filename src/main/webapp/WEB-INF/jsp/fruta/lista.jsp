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
            <h3>Listagem de Frutas:</h3>
            <h4><a href="/fruta/cadastro">Nova Fruta</a></h4>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descrição</th>
                        <th>Valor</th>
                        <th>Código</th>
                        <th>Peso</th>
                        <th>Pacote</th>
                        <th>Validade</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="f" items="${listaFruta}">
                        <tr>
                            <td>${f.id}</td>
                            <td>${f.descricao}</td>
                            <td>${f.valor}</td>
                            <td>${f.codigo}</td>
                            <td>${f.peso}</td>
                            <td>${f.pacote}</td>
                            <td>${f.validade}</td>
                            <td><a href="/fruta/excluir/${f.id}">Excluir</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>