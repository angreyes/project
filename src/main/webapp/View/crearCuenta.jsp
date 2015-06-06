<%-- 
    Document   : crearCuenta
    Created on : 29/05/2015, 02:43:22 PM
    Author     : GSN
--%>
<%@page import="edu.uan.fis.jeesample.dao.impl.UserDaoJdbc"%>
<%@page import="edu.uan.fis.jeesample.dto.User"%>
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
        <title>crearCuenta</title>
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
                <div class="crearCuenta">
                    <h1>Crear Una Cuenta</h1>
                    <p>Ingresa tus datos y no olvides que para hacer tus 
                    compras deberas completar los campos de dirección de envio,
                    y de forma de pago. Recuerda que los campos con * son
                    obligatorios.</p>
                    <form action="../crearCuenta.do" method="post">
                        <table>
                            <tr>
                                <td><input type="text" name="nombreUser" placeholder="Escribe tu Usuario"></td>
                                <td><input type="text" name="entidad" placeholder="Escribe la Entidad"></td>
                            </tr>
                            <tr>
                                <td><input type="text" name="correo" placeholder="correo@correo.com"></td>
                                <td><input type="text" name="tarjetaCredito" placeholder="Tarjeta xxx-xxx-xxx-xx"></td>
                            </tr>
                            <tr>
                                <td><input type="password" name="passTarjeta" placeholder="Escriba su password Tarjeta"></td>
                                <td><input type="password" name="pass" placeholder="Escriba su password"></td>
                            </tr>
                            <tr>
                                <td><input type="text" name="repetirContraseña" placeholder="Repetir contraseña"></td>
                                <td><input type="checkbox" name="crecordar">Recordarme 
                                    <input class="button" type="submit" value="Registrarme"></td>
                            </tr>
                                                        
                        </table>
                        
                    </form>
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
