<%-- 
    Document   : producto
    Created on : 29/05/2015, 02:45:59 PM
    Author     : GSN
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <%! String iconoDerecho="/jee-sample-1.0-SNAPSHOT/Imagenes/iconoMujer.png";
            String iconoIzquierdo="/jee-sample-1.0-SNAPSHOT/Imagenes/icono.png";
            String imgBienvenido="/jee-sample-1.0-SNAPSHOT/Imagenes/bienvenido.png";
            String imgContactos="/jee-sample-1.0-SNAPSHOT/Imagenes/Contactos.png";
            String imgFacebook="/jee-sample-1.0-SNAPSHOT/Imagenes/facebook.jpg";
            String imgTwitter="/jee-sample-1.0-SNAPSHOT/Imagenes/twi.jpg";
            String imgVisa="/jee-sample-1.0-SNAPSHOT/Imagenes/visa.jpg";
            String imgMaster="/jee-sample-1.0-SNAPSHOT/Imagenes/mastercard.png";
            String imgPagosOnline="/jee-sample-1.0-SNAPSHOT/Imagenes/pagosonline.png";
            String imgPrint="/jee-sample-1.0-SNAPSHOT/Imagenes/pint.jpg";
            String imgpublicidad4="/jee-sample-1.0-SNAPSHOT/Imagenes/publicidad4.png";
            String imgpublicidad3="/jee-sample-1.0-SNAPSHOT/Imagenes/publicidad3.png";
            String imgpublicidad2="/jee-sample-1.0-SNAPSHOT/Imagenes/publicidad2.png";
            String imgpublicidad1="/jee-sample-1.0-SNAPSHOT/Imagenes/publicidad1.png";
            
            String stile="/jee-sample-1.0-SNAPSHOT/Stiles/stylesheet3.css";             
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='<%=stile%>'/>
        <title>Producto</title>
    </head>
    <body>
        <h1></h1>
        <div class="linea">
        </div>
        <div id="icono">
            <a href="/jee-sample-1.0-SNAPSHOT/index.jsp"><img src="<%=iconoIzquierdo%>" width="160" height="100"/></a>
        </div>
        <div id="registro">
            <p class="total" >TusCompras: $ <c:out value="${comprar.precio}"/> </p>
            
            <p class="registros"><a href="/jee-sample-1.0-SNAPSHOT/View/inicioSesion.jsp">Mi cuenta</a> | <a href="/jee-sample-1.0-SNAPSHOT/View/crearCuenta.jsp">Registrarme</a></p>            
        </div>
        <div id="imagen">
            <img src="<%=iconoDerecho%>" width="60" height="70"/>
        </div>
        </div>
            <div id="menu">
            <br><br><a href="/jee-sample-1.0-SNAPSHOT/listBrasier.do">
            <div class="botonR">
                Brasieres
            </div><br></a><a href="/jee-sample-1.0-SNAPSHOT/listPanties.do">
            <div class="botonA">
                Panties
            </div><br></a><a href="/jee-sample-1.0-SNAPSHOT/listVestido.do">
            <div class="botonR">
                Trajes de Baño
            </div><br></a><a href="/jee-sample-1.0-SNAPSHOT/listLenceria.do">
            <div class="botonA">
                Lenceria
            </div><br></a><a href="/jee-sample-1.0-SNAPSHOT/listOfertas.do">
            <div class="botonR">
                Ofertas
            </div><br></a><a href="/jee-sample-1.0-SNAPSHOT/listMasculino.do">
            <div class="botonA">
                Masculino
            </div></a>
        </div>
         <div id="productos">
            <div class="prod">
                <div class="categoria">Compras</div>
                <div class="precio">
                    <div class="ims">
                        <img src="<c:out value="${comprar.url_image}"/>" height="300" width="200">
                    </div>
                    <div class="Descripcion">
                        <h1><c:out value="${comprar.nombre}"/></h1>
                        <h3>Total</h3>
                        <c:out value="${comprar.precio}"/>
                        <h3>Descripción</h3>
                        <c:out value="${comprar.descripcion}"/>
                        <h3>Talla</h3>
                        32B 
                        <h3>Cantidad</h3>
                        1
                        <div class="botonR"> Comprar                    
                    </div>
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
    </body>
</html>
