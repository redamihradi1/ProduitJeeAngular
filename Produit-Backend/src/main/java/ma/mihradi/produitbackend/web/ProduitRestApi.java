package ma.mihradi.produitbackend.web;

import lombok.AllArgsConstructor;
import ma.mihradi.produitbackend.dtos.ProduitDto;
import ma.mihradi.produitbackend.entities.Produit;
import ma.mihradi.produitbackend.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ProduitRestApi {
    private ProduitService produitService;

    @GetMapping("/produits/all")
    public List<Produit> listProduits(){
        return produitService.getProduits();
    }

    @GetMapping("/produits/{id}")
    public Produit getProduit(@PathVariable String id){return produitService.getProduit(id);}

    @PostMapping ("/produits/add")
    public void saveCustomer (@RequestBody ProduitDto produitDto) {
        produitService.saveProduit(produitDto);
    }

    @DeleteMapping("/produits/{id}/delete")
    public void deleteProduit(@PathVariable String id ){produitService.deleteProduit(id);}

    @PutMapping("/produits/{id}/update")
    public ProduitDto updateProduit(@PathVariable String id ,@RequestBody ProduitDto produit){
        return  produitService.editProduit(id,produit);
    }

}
