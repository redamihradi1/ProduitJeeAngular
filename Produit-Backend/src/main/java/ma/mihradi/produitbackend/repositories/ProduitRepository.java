package ma.mihradi.produitbackend.repositories;

import ma.mihradi.produitbackend.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,String> {
}
