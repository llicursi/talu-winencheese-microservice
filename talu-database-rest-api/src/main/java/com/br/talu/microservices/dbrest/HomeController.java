package com.br.talu.microservices.dbrest;

import com.br.talu.microservices.models.wine.GrapeType;
import com.br.talu.microservices.models.wine.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private WineRepository wineRepository;

    @RequestMapping(value = "/data/populate/", method = RequestMethod.GET, consumes = "*/*", name = "Populate")
    public String populateDummyDatatabase(){
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

        return "{ 'status' : '2 new entry to the database. '}";
    }
}
