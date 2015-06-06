<%-- 
    Document   : index
    Created on : 25/05/2015, 12:38:17 AM
    Author     : GSN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='<%=stile%>'/>
        <title>index</title>
    </head>
    <body>
        <h1></h1>
        <div class="linea">
        </div>
        <div id="icono">
            <a href="index.jsp"><img src="<%=iconoIzquierdo%>" width="160" height="100"/></a>
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
            </div><br></a><a href="listVestidosBaño.do">
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
            <div class="prod">
                        <center><div id="fondo">
                                <img src="<%=imgpublicidad3%>" width="500" height="400">
                    </div></center>
            </div>
        </div>
        <center>
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
        </center>
    </body>
</html>