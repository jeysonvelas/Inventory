package com.inventory.net.inventory.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_categoria", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Inventario> inventarios;


    public Categoria() {
    }

    public Categoria(Long id) {
        this.id = id;
    }

    public Categoria(Long id, String name, List<Inventario> inventarios) {
        this.id = id;
        this.name = name;
        this.inventarios = inventarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", inventarios=" + inventarios +
                '}';
    }
}
