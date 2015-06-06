<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
    </head>
    <body>
        <h1><c:out value="${product.productId}"></c:out></h1>
        <div class="registro">
            aquí va el INGRESO
        </div>
        <div class="menu">
            aquí va el MENU
        </div>
        <div class="productos">
            aquí va la MUESTRA DE PRODUCTOS
        </div>
        <div class="contactenos">
            aquí van Los CONTACTOS
        </div>
    </body>
</html>
