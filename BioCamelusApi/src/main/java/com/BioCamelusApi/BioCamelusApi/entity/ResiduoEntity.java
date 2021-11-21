package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "Residuo")
public class ResiduoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreResiduo;
    private String CodigoResiduo;
    private int catidadResiduo;
    private int valorResiduo;
    private String estadoResiduo;
    private String imagenResiduo;
    
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TipoResiduoEntity tipoResiduo;

    public ResiduoEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }

    public String getCodigoResiduo() {
        return CodigoResiduo;
    }

    public void setCodigoResiduo(String codigoResiduo) {
        CodigoResiduo = codigoResiduo;
    }

    public int getCatidadResiduo() {
        return catidadResiduo;
    }

    public void setCatidadResiduo(int catidadResiduo) {
        this.catidadResiduo = catidadResiduo;
    }

    public int getValorResiduo() {
        return valorResiduo;
    }

    public void setValorResiduo(int valorResiduo) {
        this.valorResiduo = valorResiduo;
    }

    public String getEstadoResiduo() {
        return estadoResiduo;
    }

    public void setEstadoResiduo(String estadoResiduo) {
        this.estadoResiduo = estadoResiduo;
    }

    public String getImagenResiduo() {
        return imagenResiduo;
    }

    public void setImagenResiduo(String imagenResiduo) {
        this.imagenResiduo = imagenResiduo;
    }

    public TipoResiduoEntity getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(TipoResiduoEntity tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

}
