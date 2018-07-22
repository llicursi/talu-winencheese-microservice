package com.br.talu.microservices;

import com.br.talu.microservices.dbrest.WineRepository;
import com.br.talu.microservices.models.wine.GrapeType;
import com.br.talu.microservices.models.wine.SmellSense;
import com.br.talu.microservices.models.wine.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@SpringBootApplication
@EnableDiscoveryClient()
public class Application {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
        System.out.println("My server is on!");
    }

    @Autowired
    private WineRepository wineRepository;

    @PostConstruct
    @Transactional
    public void onLoad(){
        Wine cabernet = new Wine();
        cabernet.setName("Cosecha de Tarapaca");
        cabernet.setGrape(GrapeType.CABERNET_SAVIGNON);
        cabernet.setWillYouBuyItAgain(true);
        cabernet.setNationality("Chile");
        cabernet.setDescription("Um vinho barato e de alta qualidade que supera os nacionais.");

        wineRepository.save(cabernet);


        Wine italianWine = new Wine();
        italianWine.setName("Luccarelli");
        italianWine.setGrape(GrapeType.PRIMITIVO);
        italianWine.setWillYouBuyItAgain(true);
        italianWine.setNationality("Italian");
        italianWine.setDescription("Tres estrelas verticais num rotulo preto, " +
                "seguido do nome da vinicola Lucarelli e informações georgrafica protegida." +
                "Teor alcoolico : 13,5%");

        wineRepository.save(italianWine);
    }

}
