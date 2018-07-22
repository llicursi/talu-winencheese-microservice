package com.br.talu.microservices.models.wine;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class TasteSense {
    private int sweetness;
    private int acidity;
    private int bitterness;
    private int salty;
}
