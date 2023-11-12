<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <div class="mb-3 mt-3">
            <label for="descricao">Nome:</label>
            <input type="text" class="form-control" value="Produto" id="descricao" placeholder="Entre com a sua descrição" name="descricao" required>
        </div>
        <div class="mb-3 mt-3">
            <label for="valor">Valor:</label>
            <input type="number" step="0.001" class="form-control" value="1" id="valor" placeholder="Entre com o seu valor" name="valor" required>
        </div>
        <div class="mb-3 mt-3">
            <label for="codigo">Código:</label>
            <input type="number" class="form-control" value="1" id="codigo" placeholder="Entre com o seu código" name="codigo" required>
        </div>
    </body>
</html>

