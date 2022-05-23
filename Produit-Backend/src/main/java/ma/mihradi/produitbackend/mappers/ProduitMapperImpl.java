package ma.mihradi.produitbackend.mappers;

import ma.mihradi.produitbackend.dtos.ProduitDto;
import ma.mihradi.produitbackend.entities.Produit;
import org.springframework.stereotype.Service;

@Service
public class ProduitMapperImpl {
    public ProduitDto fromProduit(Produit produit){
        ProduitDto produitDto = new ProduitDto();
        produitDto.setNomProduit(produit.getNomProduit());
        produitDto.setPrix(produit.getPrix());
        produitDto.setDisponible(produit.isDisponible());

        return  produitDto;
    }

    public Produit fromProduitDto(ProduitDto produitDto){
        Produit produit= new Produit();
        produit.setNomProduit(produitDto.getNomProduit());
        produit.setPrix(produitDto.getPrix());
        produit.setDisponible(produitDto.isDisponible());

        return  produit;
    }
}
