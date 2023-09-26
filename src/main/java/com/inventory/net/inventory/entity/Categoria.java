package com.inventory.net.inventory.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false, unique = true)
    private Long idCategoria;

    @Column(length = 50)
    private String name;

    @OneToMany(mappedBy = "categoria")
    private List<Inventario> inventarios;


    public Categoria() {
    }

    public Categoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria(Long idCategoria, String name, List<Inventario> inventarios) {
        this.idCategoria = idCategoria;
        this.name = name;
        this.inventarios = inventarios;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + idCategoria +
                ", name='" + name + '\'' +
                ", inventarios=" + inventarios +
                '}';
    }
}
