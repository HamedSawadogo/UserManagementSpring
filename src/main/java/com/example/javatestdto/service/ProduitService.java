package com.example.javatestdto.service;

import com.example.javatestdto.model.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    public  Produit addProduit(Produit produit);
    public  void deleteProduit(int id);
    public List<Produit> getProducts();
    public Optional<Produit> getProduitById(int id);
}
