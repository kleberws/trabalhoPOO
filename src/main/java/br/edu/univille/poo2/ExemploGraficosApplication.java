package br.edu.univille.poo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.edu.univille.poo2.exemplograficos.repository") 
@EntityScan("br.edu.univille.poo2.exemplograficos.model")
public class ExemploGraficosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExemploGraficosApplication.class, args);
    }
}
