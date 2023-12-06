package com.example.ffmjava232asterixapi;

import lombok.Data;
import lombok.With;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Character")
@With
public record Character(String id, String name, int age, String profession) {
}
