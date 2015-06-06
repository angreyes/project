package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.UserDao;
import edu.uan.fis.jeesample.dto.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User DAO implementation using JDBC
 */
public class UserDaoJdbc implements UserDao {
    
    public User create(User usuario) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the product in the database
            String insertData= "INSERT INTO  `coquetas`.`usuarios` (\n" +
                    "`nombre` ," +
                    "`correo` ," +
                    "`password` ," +
                    "`entidad` ," +
                    "`tarjeta_credito` ," +
                    "`pass_tarjeta` ," +
                    "`tipo` ," +
                    "`username`" +
                    ")" +
                    "VALUES (?,?,?,?,?,?,?,?);";
            stmt = conn.prepareStatement(insertData);
            stmt.setString(1, usuario.getName());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPassword());
            stmt.setString(4, usuario.getEntidad());
            stmt.setInt(5, usuario.getTarjetaCredito());
            stmt.setString(6, usuario.getPassTarjeta());
            stmt.setInt(7, usuario.getTipo());
            stmt.setString(8, usuario.getUsername());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }
    
    public User update(User user) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String updateData= "UPDATE `usuarios` SET `nombre`=? WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setString(1,user.getName());
            stmt.setInt(2,user.getId_usuario());   
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }
    
    public void delete(User user) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String deleteData= "DELETE FROM `usuarios` WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,user.getId_usuario());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public User findById(Integer userId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String findId = "SELECT * FROM `usuarios` WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, userId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new User();
                p.setName(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return userId;
        return p;
    }
    
    public User findByName(String nombre,String password) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String findId = "SELECT * FROM `usuarios` WHERE `username` LIKE ? AND `password` LIKE ? ";
            stmt = conn.prepareStatement(findId);
            stmt.setString(1, nombre);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new User();
                p.setName(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return userId;
        return p;
    }
    
    public List<User> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<User> users = new ArrayList<User>();
        User p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String findId= "SELECT * FROM `usuarios` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new User();                
                p.setId_usuario(rs.getInt("id_usuario"));
                p.setName(rs.getString("nombre"));
                p.setEmail(rs.getString("correo"));
                p.setPassword(rs.getString("password"));
                p.setEntidad(rs.getString("entidad"));
                p.setTarjetaCredito(rs.getInt("tarjeta_credito"));
                p.setPassTarjeta(rs.getString("pass_tarjeta"));
                p.setTipo(rs.getInt("tipo"));
                p.setUsername(rs.getString("username"));
                
                users.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return users;
    //    return null;
    }
}
