package com.br.talu.microservices.models.wine;

import com.br.talu.microservices.models.Comment;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Describe the details of wine and its evaluation characteristics
 * based on the following criteria : https://www.wineturtle.com/sensory-characteristics-of-wine/
 *
 * A wine must be good and remarkable.
 */
@Entity
@Table(name="Wine")
@Data
@NoArgsConstructor
public class Wine {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String nationality;
    private GrapeType grape;
/*    private TasteSense taste;*/
/*    private TouchSense touch;*/
/*    private SmellSense smell;*/
    private boolean willYouBuyItAgain;
    private String description;

    //private List<Comment> comments;

}
