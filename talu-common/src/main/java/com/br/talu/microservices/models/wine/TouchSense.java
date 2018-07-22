package com.br.talu.microservices.models.wine;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class TouchSense {

    private int body;
    private int heat;
    private int astringency;
    private int texture;

}
