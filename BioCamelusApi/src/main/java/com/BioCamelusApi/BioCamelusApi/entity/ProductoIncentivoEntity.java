package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "ProductoIncentivo")
public class ProductoIncentivoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private String nombreIncentivo;
    private String descripcionIncentivo;
    private int cantidadIncentivo;
    private int valorIncentivo;

    





    public ProductoIncentivoEntity() {

    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    public String getNombreIncentivo() {
        return nombreIncentivo;
    }


    public void setNombreIncentivo(String nombreIncentivo) {
        this.nombreIncentivo = nombreIncentivo;
    }


    public String getDescripcionIncentivo() {
        return descripcionIncentivo;
    }


    public void setDescripcionIncentivo(String descripcionIncentivo) {
        this.descripcionIncentivo = descripcionIncentivo;
    }


    public int getCantidadIncentivo() {
        return cantidadIncentivo;
    }


    public void setCantidadIncentivo(int cantidadIncentivo) {
        this.cantidadIncentivo = cantidadIncentivo;
    }


    public int getValorIncentivo() {
        return valorIncentivo;
    }


    public void setValorIncentivo(int valorIncentivo) {
        this.valorIncentivo = valorIncentivo;
    }


    


    



   

    

   
  
}
