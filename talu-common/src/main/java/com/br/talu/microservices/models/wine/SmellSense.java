package com.br.talu.microservices.models.wine;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class SmellSense {
    private String nose;
}
