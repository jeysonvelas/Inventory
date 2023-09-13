package com.inventory.net.inventory.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 300)
    private String description;

    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Inventario> inventarios = new ArrayList<>();

}
