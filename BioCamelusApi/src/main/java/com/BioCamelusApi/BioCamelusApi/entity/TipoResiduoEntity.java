package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "TipoResiduo")
public class TipoResiduoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private String carton;
    private String botellaplastica;
    private String lataAluminio;
    





    public TipoResiduoEntity() {

    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    public String getCarton() {
        return carton;
    }


    public void setCarton(String carton) {
        this.carton = carton;
    }


    public String getBotellaplastica() {
        return botellaplastica;
    }


    public void setBotellaplastica(String botellaplastica) {
        this.botellaplastica = botellaplastica;
    }


    public String getLataAluminio() {
        return lataAluminio;
    }


    public void setLataAluminio(String lataAluminio) {
        this.lataAluminio = lataAluminio;
    }


 


    



   

    

   
  
}
