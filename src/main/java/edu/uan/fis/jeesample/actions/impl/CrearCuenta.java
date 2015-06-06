package edu.uan.fis.jeesample.actions.impl;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.ICommand;
import edu.uan.fis.jeesample.dao.ProductDao;
import edu.uan.fis.jeesample.dao.UserDao;
import edu.uan.fis.jeesample.dao.impl.ProductDaoJdbc;
import edu.uan.fis.jeesample.dao.impl.UserDaoJdbc;
import edu.uan.fis.jeesample.dto.Product;
import edu.uan.fis.jeesample.dto.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class CrearCuenta implements ICommand {

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
          String nombreUser = request.getParameter("nombreUser"); // dummy parameter
          String entidad = request.getParameter("entidad");
          String correo = request.getParameter("correo"); // dummy parameter
          String tarjetaCreditoT = request.getParameter("tarjetaCredito");
          String passwordTarjeta = request.getParameter("passTarjeta"); // dummy parameter
          String password = request.getParameter("pass");
          String repetirContraseña = request.getParameter("repetirContraseña"); // dummy parameter
          Integer tarjetaCredito = Integer.parseInt(tarjetaCreditoT);
          String resultado;
        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
          User nuevo;
//          User user = new User(
//                null, nombreUser, correo, nombreUser, contraseña, entidad, 
//                tarjetaCredito, contraseña1, 1);
        User user = new User(null,nombreUser , correo, nombreUser, password, entidad, tarjetaCredito, passwordTarjeta, 7);
        UserDaoJdbc dao = new UserDaoJdbc();
        nuevo = dao.create(user);
        resultado="GREAT, your user";
           

            // store the products in the request, so them can be painted in the view
            request.setAttribute("cuenta", resultado);
            // 3. Finally, returns the command result
            result.setResult("crearCuenta");
        } catch (Exception e) {
            Logger.getLogger(CrearCuenta.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }

    private void assertEquals(User expResult, User result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
