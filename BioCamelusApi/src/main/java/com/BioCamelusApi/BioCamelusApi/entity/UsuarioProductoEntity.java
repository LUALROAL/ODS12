package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "UsuarioProducto")
public class UsuarioProductoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private int idUsuario;
    private int idProducto;
    private String fecha;
    private String estado;
    private int cantidad;
    
    





    public UsuarioProductoEntity() {

    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    public int getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    public int getIdProducto() {
        return idProducto;
    }


    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    


    



   

    

   
  
}
