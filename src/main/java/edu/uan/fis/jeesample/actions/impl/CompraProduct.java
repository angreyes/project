package edu.uan.fis.jeesample.actions.impl;

import edu.uan.fis.jeesample.actions.CommandResult;
import edu.uan.fis.jeesample.actions.ICommand;
import edu.uan.fis.jeesample.dao.ProductDao;
import edu.uan.fis.jeesample.dao.impl.ProductDaoJdbc;
import edu.uan.fis.jeesample.dto.Product;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class CompraProduct implements ICommand {

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
         //   String parameter1 = request.getParameter("paramater1"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ProductDao dao = new ProductDaoJdbc();
            List<Product> products = dao.findCategoria("1");
            
            // store the products in the request, so them can be painted in the view
            request.setAttribute("comprar", products.get(5));
            // 3. Finally, returns the command result
            result.setResult("compraProduct");
        } catch (Exception e) {
            Logger.getLogger(CompraProduct.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    
    
}
