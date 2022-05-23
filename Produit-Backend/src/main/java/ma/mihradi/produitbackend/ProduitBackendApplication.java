package ma.mihradi.produitbackend;

import ma.mihradi.produitbackend.entities.Produit;
import ma.mihradi.produitbackend.services.ProduitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ProduitBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitBackendApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(ProduitService produitService){
        return args -> {
            Produit p1 = new Produit(
                    UUID.randomUUID().toString(),
                    "produit1",
                    22.22,
                    true
            );
            produitService.saveProduit(p1);
        };
    }*/

}
