package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "UsuarioIncentivo")
public class UsuarioIncentivoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private int idUsuario;
    private int idIncentivo;
    private int idAcopio;
    private String fecha;
    private String estado;
    private int cantidad;
    
    





    public UsuarioIncentivoEntity() {

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


    public int getIdIncentivo() {
        return idIncentivo;
    }


    public void setIdIncentivo(int idIncentivo) {
        this.idIncentivo = idIncentivo;
    }


    public int getIdAcopio() {
        return idAcopio;
    }


    public void setIdAcopio(int idAcopio) {
        this.idAcopio = idAcopio;
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
