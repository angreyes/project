<%-- 
    Document   : catalogo
    Created on : 29/05/2015, 02:44:40 PM
    Author     : GSN
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="edu.uan.fis.jeesample.dao.impl.ProductDaoJdbc" %>
        <%@page import="edu.uan.fis.jeesample.dto.Product" %>
        <%! String iconoDerecho="Imagenes/iconoMujer.png";
            String iconoIzquierdo="Imagenes/icono.png";
            String imgBienvenido="Imagenes/bienvenido.png";
            String imgContactos="Imagenes/Contactos.png";
            String imgFacebook="Imagenes/facebook.jpg";
            String imgTwitter="Imagenes/twi.jpg";
            String imgVisa="Imagenes/visa.jpg";
            String imgMaster="Imagenes/mastercard.png";
            String imgPagosOnline="Imagenes/pagosonline.png";
            String imgPrint="Imagenes/pint.jpg";
            String imgpublicidad4="Imagenes/publicidad4.png";
            String imgpublicidad3="Imagenes/publicidad3.png";
            String imgpublicidad2="Imagenes/publicidad2.png";
            String imgpublicidad1="Imagenes/publicidad1.png";
            
            String stile="Stiles/stylesheet3.css";
            
            ProductDaoJdbc Dao = new ProductDaoJdbc();
            
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='<%=stile%>'/>
        <title>Catalogo</title>
    </head>
    <body>
        <h1></h1>
        <div class="linea">
        </div>
        <div id="icono">
            <a href="/jee-sample-1.0-SNAPSHOT/index.jsp"><img src="<%=iconoIzquierdo%>" width="160" height="100"/></a>
        </div>
        <div id="registro">
            <p class="total">TusCompras: $ 0</p>
            <p class="registros"><a href="/jee-sample-1.0-SNAPSHOT/View/inicioSesion.jsp">Mi cuenta</a> | <a href="/jee-sample-1.0-SNAPSHOT/View/crearCuenta.jsp">Registrarme</a></p>            
        </div>
        <div id="imagen">
            <img src="<%=iconoDerecho%>" width="60" height="70"/>
        </div>
        <div id="menu">
            <br><br><a href="listBrasier.do">
            <div class="botonR">
                Brasieres
            </div><br></a><a href="listPanties.do">
            <div class="botonA">
                Panties
            </div><br></a><a href="listVestido.do">
            <div class="botonR">
                Trajes de Baño
            </div><br></a><a href="listLenceria.do">
            <div class="botonA">
                Lenceria
            </div><br></a><a href="listOfertas.do">
            <div class="botonR">
                Ofertas
            </div><br></a><a href="listMasculino.do">
            <div class="botonA">
                Masculino
            </div></a>
        </div>
        <div id="productos">
            <div class="categoria">categoria</div>
            <div class="prod">
                <div class="unidades">
                        <!-- Here the productList variable used in items is the same name 
                used when storing the result in the ListProducts command class-->
                        <c:forEach items="${brasierList}" var="productResult">
                            <div class="unidad">
                                <img src="<c:out value="${productResult.url_image}"/>" height="100" width="100"><a href="productDescription.do">
                                <p><c:out value="${productResult.nombre}"></c:out></p>
                                <p><c:out value="${productResult.precio}"></c:out></p>
                            </div>
                        </c:forEach>            
                </div>
            </div>
        </div>
        <div id="contactenos">
            <div class="contacto">
                <div class="conta1">
                    <img src="<%=imgpublicidad4%>" width="700" height="400"/>
                </div>
                <div class="conta2">
                    <h2>Buscanos en:</h2>
                    <a href="#"><img src="<%=imgFacebook%>" width="60" height="60"/></a>
                    <a href="#"><img src="<%=imgTwitter%>" width="60" height="60"/></a>
                    <a href="#"><img src="<%=imgPrint%>" width="60" height="60"/></a>
                    <h2>Medios de pago:</h2>
                    <a href="#"><img src="<%=imgPagosOnline%>" width="200" height="60"/></a>
                    <a href="#"><img src="<%=imgVisa%>" width="100" height="60"/></a>
                    <a href="#"><img src="<%=imgMaster%>" width="100" height="60"/></a>
                </div>
            </div>
        </div>
                <table>
            <thead>
                <tr>
                    <th>Product id</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <!-- Here the productList variable used in items is the same name 
                used when storing the result in the ListProducts command class-->                
            </tbody>
        </table>
    </body>
</html>
