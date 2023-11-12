<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>appgestaoterrenofrutas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-3">
            <h2>Cadastramento de Usuários</h2>

            <form action="/usuario/incluir" method="post">

                <div class="mb-3 mt-3">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" value="Julio Cesar" id="nome" placeholder="Entre com o seu nome" name="nome" required>
                </div>

                <div class="mb-3 mt-3">
                    <label for="email">E-mail:</label>
                    <input type="email" class="form-control" value="julio.rsilva@al.infnet.edu.br" id="email" placeholder="Entre com o seu e-mail" name="email" required>
                </div>

                <div class="mb-3">
                    <label for="pwd">Senha:</label>
                    <input type="password" class="form-control" value="julio.rsilva@al.infnet.edu.br" id="pwd" placeholder="Entre com a sua senha" name="senha" required>
                </div>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>