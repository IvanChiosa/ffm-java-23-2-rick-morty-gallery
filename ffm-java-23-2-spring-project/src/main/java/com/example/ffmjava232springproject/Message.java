package com.example.ffmjava232springproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    private String id;
    private String name;
    private String message;
}
