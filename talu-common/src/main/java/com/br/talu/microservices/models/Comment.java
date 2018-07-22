package com.br.talu.microservices.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Data
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private int id;
    private int replyId;
    private int user;
    private String comment;
    private String timestamp;

}
