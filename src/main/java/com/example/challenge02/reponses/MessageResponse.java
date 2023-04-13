package com.example.challenge02.reponses;

import lombok.Data;

@Data
public class MessageReponse {

    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }
}
