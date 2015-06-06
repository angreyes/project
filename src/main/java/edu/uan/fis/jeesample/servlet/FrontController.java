package edu.uan.fis.jeesample.servlet;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.impl.CompraProduct;
import edu.uan.fis.jeesample.actions.impl.CrearCuenta;
import edu.uan.fis.jeesample.actions.impl.IniciarSesion;
import edu.uan.fis.jeesample.actions.impl.ListBrasier;
import edu.uan.fis.jeesample.actions.impl.ListLenceria;
import edu.uan.fis.jeesample.actions.impl.ListMasculino;
import edu.uan.fis.jeesample.actions.impl.ListOfertas;
import edu.uan.fis.jeesample.actions.impl.ListPanties;
import edu.uan.fis.jeesample.actions.impl.ListVestidoBaño;
import edu.uan.fis.jeesample.actions.impl.ProductDesc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"*.do"})
public class FrontController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Front controller servlet parses the URL to get the requested 
        // action and send the control of this action to the appropriate 
        // command class

        String desiredAction = request.getServletPath();
        String destination = null;
        CommandResult result = null;
        // TODO: read the cases from a configuration file. Extra points!!!
        switch (desiredAction) {
            case "/listBrasier.do":
                result = new ListBrasier().execute(request, response);
                break;
            case "/iniciarSesion.do":
                result = new IniciarSesion().execute(request, response);
                break;
            case "/crearCuenta.do":
                result = new CrearCuenta().execute(request, response);
                break;
            case "/listVestido.do":
                result = new ListVestidoBaño().execute(request, response);
                break; 
            case "/listMasculino.do":
                result = new ListMasculino().execute(request, response);
                break;
            case "/listOfertas.do":
                result = new ListOfertas().execute(request, response);
                break;
            case "/listPanties.do":
                result = new ListPanties().execute(request, response);
                break;
            case "/listLenceria.do":
                result = new ListLenceria().execute(request, response);
                break;
            case "/productDescription.do":
                result = new ProductDesc().execute(request, response);
                break; 
            case "/compraProduct.do":
                result = new CompraProduct().execute(request, response);
                break;                 
            case "home.do":                
            default:
                result = new CommandResult();
        }

        // Depending on the command result choose the appropriate view
        // You can add new cases according tou your design
        // TODO: read the cases from a configuration file. Extra points!!!
        switch (result.getResult()) {
            case "error":
                destination = "/error.jsp";
                break;
            case "listBrasier":
                destination = "/View/catalogoBrasier.jsp";
                break;                
            case "iniciarSesion":
                destination = "/View/inicioSesion.jsp";
                break;
            case "crearCuenta":
                destination = "/View/crearCuenta.jsp";
                break;
            case "listVestido":
                destination = "/View/catalogoVestidosBaño.jsp";
                break;
            case "listMasculino":
                destination = "/View/catalogoMasculino.jsp";
                break;
            case "listOfertas":
                destination = "/View/catalogoOfertas.jsp";
                break;
            case "listPanties":
                destination = "/View/catalogoPanties.jsp";
                break;
            case "listLenceria":
                destination = "/View/catalogoLenceria.jsp";
                break;
            case "productDescription":
                destination = "/View/producto.jsp";
                break;
            case "compraProduct":
                destination = "/View/compra.jsp";
                break;                
            case "home":
            default:
                destination = "/index.jsp";
        }

            // Using a dispatcher class and the result of the command execution
        // the front controller redirects the user to the appropriate view
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Front controller servlet";
    }// </editor-fold>

}
