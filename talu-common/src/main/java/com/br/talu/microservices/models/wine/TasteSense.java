package com.br.talu.microservices.models.wine;

import lombok.Data;

@Data
public class TasteSense {
    private int sweetness;
    private int acidity;
    private int bitterness;
    private int salty;
}
