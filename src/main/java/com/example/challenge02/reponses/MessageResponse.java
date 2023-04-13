package com.example.challenge02.reponses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class MessageResponse {

    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }
}
