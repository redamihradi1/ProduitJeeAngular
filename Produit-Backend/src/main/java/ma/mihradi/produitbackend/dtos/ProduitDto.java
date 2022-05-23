package ma.mihradi.produitbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data

public class ProduitDto {

    private String nomProduit;
    private double prix;
    private boolean disponible;

}
