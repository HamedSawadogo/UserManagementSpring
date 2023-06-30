package com.example.javatestdto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor @AllArgsConstructor
public class Categorie {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nomCategorie;
}
