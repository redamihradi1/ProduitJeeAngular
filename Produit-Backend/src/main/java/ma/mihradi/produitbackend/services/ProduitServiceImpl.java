package ma.mihradi.produitbackend.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.mihradi.produitbackend.dtos.ProduitDto;
import ma.mihradi.produitbackend.entities.Produit;
import ma.mihradi.produitbackend.mappers.ProduitMapperImpl;
import ma.mihradi.produitbackend.repositories.ProduitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class ProduitServiceImpl implements ProduitService{
    private ProduitRepository produitRepository;
    private ProduitMapperImpl dtoMapper;
    @Override
    public void saveProduit(ProduitDto produitDto) {
        log.info("Enregistrement du produit ... ");
        Produit produit = dtoMapper.fromProduitDto(produitDto);
        produit.setId(UUID.randomUUID().toString());
        produitRepository.save(produit);
    }

    @Override
    public ProduitDto editProduit(String id, ProduitDto produitDto) {
        log.info("Modification d'un produit...");
        Produit produit = dtoMapper.fromProduitDto(produitDto);
        produit.setId(id);
        Produit savedProduit =  produitRepository.save (produit);
        return dtoMapper.fromProduit(savedProduit);
    }


    @Override
    public void deleteProduit(String idProduit) {
        Produit p = produitRepository.findById(idProduit).orElse(null);
        if (p!=null)
            produitRepository.delete(p);
    }


    @Override
    public List<Produit> getProduits() {
       return produitRepository.findAll();
    }

    @Override
    public Produit getProduit(String idProduit) {
        Produit p = produitRepository.findById(idProduit).orElse(null);
        return  p ;
    }


}
