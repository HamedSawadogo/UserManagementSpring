package com.example.javatestdto.repository;


import com.example.javatestdto.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
