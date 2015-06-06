package edu.uan.fis.jeesample.dto;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    private Integer id_producto;
    private Integer cogido;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Integer precio;
    private String url_image;

    public Product() {
    }

    public Product(Integer id_producto, String nombre) {
        this.id_producto = id_producto;
        this.nombre = nombre;
    }

    public Product(Integer id_producto, Integer cogido, String categoria, String nombre, String descripcion, Integer precio, String url_image) {
        this.id_producto = id_producto;
        this.cogido = cogido;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.url_image = url_image;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCogido() {
        return cogido;
    }

    public void setCogido(Integer cogido) {
        this.cogido = cogido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id_producto);
        hash = 23 * hash + Objects.hashCode(this.cogido);
        hash = 23 * hash + Objects.hashCode(this.categoria);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + Objects.hashCode(this.precio);
        hash = 23 * hash + Objects.hashCode(this.url_image);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.url_image, other.url_image)) {
            return false;
        }
        return true;
    }
    
    
}
