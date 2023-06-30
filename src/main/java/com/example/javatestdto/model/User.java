package com.example.javatestdto.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table
@NoArgsConstructor @AllArgsConstructor

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Produit>produits=new ArrayList<>();


    @ManyToMany(fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Book>books=new ArrayList<>();

    //ajout de livres dans la liste des livres
    public  void addBook(Book book){
        this.books.add(book);
        book.getAuteurs().add(this);
    }

    //Hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && Objects.equals(produits, user.produits) && Objects.equals(books, user.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, produits, books);
    }
}