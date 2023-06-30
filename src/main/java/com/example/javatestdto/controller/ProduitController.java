package com.example.javatestdto.controller;

import com.example.javatestdto.model.Produit;
import com.example.javatestdto.service.ProduitService;
import com.example.javatestdto.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ProduitController implements ProduitService{

    @Autowired
    private ProduitServiceImpl produitService;


    @Override
    @RequestMapping(method = RequestMethod.POST)
    public Produit addProduit(@RequestBody  Produit produit) {
        return this.produitService.addProduit(produit);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") int id) {
       this.produitService.deleteProduit(id);
    }

    @Override
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Produit> getProducts() {
        return this.produitService.getProducts();
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Optional<Produit> getProduitById(@PathVariable("id") int id) {
        return this.produitService.getProduitById(id);
    }
}
