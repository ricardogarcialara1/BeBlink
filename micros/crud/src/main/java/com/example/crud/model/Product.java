package com.example.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private float price;
    private String fecha;
    @Transient
    private int antiguedad;

    public Product(String name, float price, String fecha) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;
    }


}
