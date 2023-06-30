package com.example.javatestdto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Book
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;
    private String title;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "books")
    @JsonBackReference
    private List<User> auteurs=new ArrayList<>();

    //ajout d'un Auteur dans la liste des Auteurs
    public void addAuteur(User user){
        this.auteurs.add(user);
        user.getBooks().add(this);
    }
}
