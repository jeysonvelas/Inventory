package com.inventory.net.inventory.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String marca;
    @Column(length = 200)
    private String descripcion;

    private int stock;

    private LocalDate fecha;

    @ManyToOne
    private Users users;
    @ManyToOne
    private Producto producto;
    @ManyToOne
    private Categoria categoria;

    public Inventario() {
    }

    public Inventario(Long id) {
        this.id = id;
    }

    public Inventario(Long id, String marca, String descripcion, int stock, LocalDate fecha, Users users, Producto producto, Categoria categoria) {
        this.id = id;
        this.marca = marca;
        this.descripcion = descripcion;
        this.stock = stock;
        this.fecha = fecha;
        this.users = users;
        this.producto = producto;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", fecha=" + fecha +
                ", users=" + users +
                ", producto=" + producto +
                ", categoria=" + categoria +
                '}';
    }
}
