package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "PuntoAcopio")
public class PuntoAcopioEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private String nombreAcopio;
    private String direccionAcopio;
    private String telefonoAcopio;
    





    public PuntoAcopioEntity() {

    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    public String getNombreAcopio() {
        return nombreAcopio;
    }


    public void setNombreAcopio(String nombreAcopio) {
        this.nombreAcopio = nombreAcopio;
    }


    public String getDireccionAcopio() {
        return direccionAcopio;
    }


    public void setDireccionAcopio(String direccionAcopio) {
        this.direccionAcopio = direccionAcopio;
    }


    public String getTelefonoAcopio() {
        return telefonoAcopio;
    }


    public void setTelefonoAcopio(String telefonoAcopio) {
        this.telefonoAcopio = telefonoAcopio;
    }


    



   

    

   
  
}
