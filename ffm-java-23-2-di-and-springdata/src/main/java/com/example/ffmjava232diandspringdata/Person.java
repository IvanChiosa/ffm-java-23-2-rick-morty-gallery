package com.example.ffmjava232diandspringdata;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Person")
public record Person (String id, String name){
}
