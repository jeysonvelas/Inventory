package com.inventory.net.inventory.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false, unique = true)
    private Long idProducto;

    @Column(length = 50)
    private String name;

    @Column(length = 300)
    private String description;

    @OneToMany(mappedBy = "producto")
    private List<Inventario> inventarios;


    public Producto() {
    }

    public Producto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Long idProducto, String name, String description, List<Inventario> inventarios) {
        this.idProducto = idProducto;
        this.name = name;
        this.description = description;
        this.inventarios = inventarios;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + idProducto +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", inventarios=" + inventarios +
                '}';
    }
}
