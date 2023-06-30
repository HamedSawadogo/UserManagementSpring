package com.example.javatestdto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
@NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String desigantion;
    private float prix;

    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private User user;

}
