/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uan.fis.jeesample.dto;

import java.io.Serializable;
import java.util.Objects;

public class Compras implements Serializable {

    private Integer id_compra;
    private Integer id_usuario;
    private Integer cantidad;
    private String fecha;
    private Integer id_produto;

    public Compras() {
    }

    public Compras(Integer id_compra, Integer id_usuario) {
        this.id_compra = id_compra;
        this.id_usuario = id_usuario;
    }
    
     
    public Compras(Integer id_compra, Integer id_usuario, Integer cantidad, String fecha, Integer id_producto) {
        this.id_compra = id_compra;
        this.id_usuario = id_usuario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.id_produto = id_producto;
    }

    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id_compra);
        hash = 71 * hash + Objects.hashCode(this.id_usuario);
        hash = 71 * hash + Objects.hashCode(this.cantidad);
        hash = 71 * hash + Objects.hashCode(this.fecha);
        hash = 71 * hash + Objects.hashCode(this.id_produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compras other = (Compras) obj;
        if (!Objects.equals(this.id_compra, other.id_compra)) {
            return false;
        }
        if (!Objects.equals(this.id_usuario, other.id_usuario)) {
            return false;
        }
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.id_produto, other.id_produto)) {
            return false;
        }
        return true;
    }

    
}
