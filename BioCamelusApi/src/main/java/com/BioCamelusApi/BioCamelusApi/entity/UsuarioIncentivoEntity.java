package com.BioCamelusApi.BioCamelusApi.entity;

import com.sun.istack.NotNull;

import org.springframework.context.index.CandidateComponentsIndexLoader;

import javax.persistence.*;

@Entity
@Table(name = "UsuarioIncentivo")
public class UsuarioIncentivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // private int idUsuario;
    // private int idIncentivo;
    // private int idAcopio;
    private String fecha;
    private String estado;
    private int cantidad;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UsuarioEntity usuario;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PuntoAcopioEntity puntoAcopio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ProductoIncentivoEntity productoIncentivo;

    public UsuarioIncentivoEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public PuntoAcopioEntity getPuntoAcopio() {
        return puntoAcopio;
    }

    public void setPuntoAcopio(PuntoAcopioEntity puntoAcopio) {
        this.puntoAcopio = puntoAcopio;
    }

    public ProductoIncentivoEntity getProductoIncentivo() {
        return productoIncentivo;
    }

    public void setProductoIncentivo(ProductoIncentivoEntity productoIncentivo) {
        this.productoIncentivo = productoIncentivo;
    }


}
