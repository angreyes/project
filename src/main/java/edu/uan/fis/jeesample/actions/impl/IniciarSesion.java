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
public class IniciarSesion implements ICommand {

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
          String nombre = request.getParameter("nombre"); // dummy parameter
          String password = request.getParameter("password");
        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            UserDao dao = new UserDaoJdbc();
            User user = dao.findByName(nombre, password);
            String respuesta="bienvenido";
            if(user==null){
                respuesta="valide sus datos";              
            }
            
                     
            // store the products in the request, so them can be painted in the view
            request.setAttribute("sesion", respuesta);
            // 3. Finally, returns the command result
            result.setResult("iniciarSesion");
        } catch (Exception e) {
            Logger.getLogger(IniciarSesion.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    
    
}
