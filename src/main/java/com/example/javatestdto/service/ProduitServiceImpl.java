package com.example.javatestdto.service;

import com.example.javatestdto.model.Produit;
import com.example.javatestdto.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService{

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public Produit addProduit(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(int id) {
      this.produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getProducts() {
        return this.produitRepository.findAll();
    }

    @Override
    public Optional<Produit> getProduitById(int id) {
        return this.produitRepository.findById(id);
    }
}
