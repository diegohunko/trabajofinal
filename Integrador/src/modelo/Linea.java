/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
/**
 *
 * @author Diego Raul Fernandez
 */
@Entity
@Table(name="renglones")
public class Linea implements Serializable{
     @Id
     @ManyToOne
     private Entrega entrega;
     @OneToOne
     private Articulo descripcion;
     private Integer cantidad;

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Articulo getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Articulo descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
