package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private String nombre;
    private String apellido;
    private int camellosAcumulados;
    private int totalResiduo;
    private int residuoValidado;
    private int PendientesPorValidar;




    public UsuarioEntity() {

    }




    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getApellido() {
        return apellido;
    }




    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




    public int getCamellosAcumulados() {
        return camellosAcumulados;
    }




    public void setCamellosAcumulados(int camellosAcumulados) {
        this.camellosAcumulados = camellosAcumulados;
    }




    public int getTotalResiduo() {
        return totalResiduo;
    }




    public void setTotalResiduo(int totalResiduo) {
        this.totalResiduo = totalResiduo;
    }




    public int getResiduoValidado() {
        return residuoValidado;
    }




    public void setResiduoValidado(int residuoValidado) {
        this.residuoValidado = residuoValidado;
    }




    public int getPendientesPorValidar() {
        return PendientesPorValidar;
    }




    public void setPendientesPorValidar(int pendientesPorValidar) {
        PendientesPorValidar = pendientesPorValidar;
    }


   
  
}
