/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.ComprasDao;
import edu.uan.fis.jeesample.dto.Compras;
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
 * Region DAO implementation using JDBC
 */
public class ComprasDaoJdbc implements ComprasDao {
    
    public Compras create(Compras compra) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String insertData= "INSERT INTO `compras`( `id_compras`, `id_usuario`, `cantidad`, `fecha`, `id_producto` )  VALUES (?,?,?,?,?)";
            stmt = conn.prepareStatement(insertData);
            stmt.setInt(1,compra.getId_compra());
            stmt.setInt(2,compra.getId_usuario());
            stmt.setInt(3,compra.getCantidad());
            stmt.setString(4,compra.getFecha());
            stmt.setInt(5,compra.getId_produto());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return compra;
    }
    
    public Compras update(Compras compra) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String updateData= "UPDATE `compras` SET `id_producto`=? WHERE `id_compras`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setInt(1,compra.getId_produto());
            stmt.setInt(2,compra.getId_compra());            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return compra;
    }
    
    public void delete(Compras compra) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String deleteData= "DELETE FROM `compras` WHERE `id_compras`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,compra.getId_compra());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Compras findById(Integer compraId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Compras p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String findId = "SELECT * FROM `compras` WHERE `id_compras`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, compraId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new Compras();
                p.setId_produto(rs.getInt("id_producto"));
                p.setId_usuario(rs.getInt("id_usuario"));
                p.setCantidad(rs.getInt("cantidad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return regionId;
        return p;
    }
    
    public List<Compras> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Compras> compras = new ArrayList<Compras>();
        Compras p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coquetas?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String findId= "SELECT * FROM `compras` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new Compras();                
                p.setId_produto(rs.getInt("id_producto"));
                p.setId_usuario(rs.getInt("id_usuario"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setFecha(rs.getString("fecha"));
                compras.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComprasDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return compras;
    //    return null;
    }
}

