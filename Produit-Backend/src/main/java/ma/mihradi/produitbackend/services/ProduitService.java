package ma.mihradi.produitbackend.services;

import ma.mihradi.produitbackend.dtos.ProduitDto;
import ma.mihradi.produitbackend.entities.Produit;

import java.util.List;

public interface ProduitService {
    void saveProduit(ProduitDto produitDto);
    ProduitDto editProduit(String id, ProduitDto produitDto);
    void deleteProduit(String idProduit);
    List<Produit> getProduits();
    Produit getProduit(String idProduit);

}
