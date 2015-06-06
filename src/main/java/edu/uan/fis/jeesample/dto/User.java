package edu.uan.fis.jeesample.dto;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private String name;
    private String email;
    private String username;    
    private String password;
    private String entidad;
    private Integer tarjetaCredito;
    private String passTarjeta;
    private Integer tipo; 
    private Integer id_usuario;

    public User() {
    }
    
    public User(Integer id_usuario,String name){
        this.id_usuario = id_usuario;
        this.name = name;
    }

    public User(Integer id_usuario,String name, String email, String username, String password, String entidad, Integer tarjetaCredito, String passTarjeta, Integer tipo) {
        this.id_usuario = id_usuario;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.entidad = entidad;
        this.tarjetaCredito = tarjetaCredito;
        this.passTarjeta = passTarjeta;
        this.tipo = tipo;
    }
    
    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Integer getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Integer tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getPassTarjeta() {
        return passTarjeta;
    }

    public void setPassTarjeta(String passTarjeta) {
        this.passTarjeta = passTarjeta;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.username);
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.entidad);
        hash = 79 * hash + Objects.hashCode(this.tarjetaCredito);
        hash = 79 * hash + Objects.hashCode(this.passTarjeta);
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.id_usuario);
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
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.entidad, other.entidad)) {
            return false;
        }
        if (!Objects.equals(this.tarjetaCredito, other.tarjetaCredito)) {
            return false;
        }
        if (!Objects.equals(this.passTarjeta, other.passTarjeta)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.id_usuario, other.id_usuario)) {
            return false;
        }
        return true;
    }
    
    
}
