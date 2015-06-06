package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.User;
import java.util.List;
import junit.framework.TestCase;

public class UsertDaoJdbcTest1 extends TestCase {
    
    public UsertDaoJdbcTest1(String testName) {
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
        User product = new User(90, " sa", "d", "s", "w", "w", 4, "W", 7);
      //  product.setProductId(3);
       // product.setName("Abogado");
        UserDaoJdbc instance = new UserDaoJdbc();
        User expResult = product;
        User result = instance.create(product);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        User user = new User(20,"Cambio_Update");
        UserDaoJdbc instance = new UserDaoJdbc();
        User expResult = user;
        User result = instance.update(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    public void testDelete() {
        System.out.println("delete");
        User user = new User(20,"estudiante");
       // user.setUserId(4);
        UserDaoJdbc instance = new UserDaoJdbc();
        instance.delete(user);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");  
    }

    public void testFindById() {
        System.out.println("findById");
        Integer userId = 1;
        UserDaoJdbc instance = new UserDaoJdbc();
        User expResult = null;
        User result = instance.findById(userId);
        System.out.println("RESULT:   "+result.getName());
      //  assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        UserDaoJdbc instance = new UserDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the defau1lt call to fail.
        //fail("The test case is a prototype.");
    }
}
