/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Compras;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class ComprasDaoJdbcTest extends TestCase {
    
    public ComprasDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create prueba");
        Compras compra = new Compras(22, 1, 1, "2015-05-24", 1);
        ComprasDaoJdbc instance = new ComprasDaoJdbc();
        Compras expResult = compra;
        Compras result = instance.create(compra);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("Actualizar");
        Compras compra = new Compras(2, 1, 1, "2015-05-24", 1);
        ComprasDaoJdbc instance = new ComprasDaoJdbc();
        Compras expResult = compra;
        Compras result = instance.update(compra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    public void testDelete() {
        System.out.println("delete");
        Compras compra = new Compras(20,1);
       // region.setRegionId(4);
        ComprasDaoJdbc instance = new ComprasDaoJdbc();
        instance.delete(compra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");  
    }

    public void testFindById() {
        System.out.println("findById");
        Integer compraId = 21;
        ComprasDaoJdbc instance = new ComprasDaoJdbc();
        Compras expResult = null;
        Compras result = instance.findById(compraId);
        System.out.println("RESULT:   "+result.getId_produto() + "_" + result.getCantidad() + "_" + result.getId_usuario());
      //  assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        ComprasDaoJdbc instance = new ComprasDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the defau1lt call to fail.
        //fail("The test case is a prototype.");
    }
}
