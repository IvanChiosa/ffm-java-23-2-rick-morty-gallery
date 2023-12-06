package com.example.ffmjava232asterixapi;

import lombok.*;

import java.util.UUID;


@Data@Builder
public class AsterixDTO {

    private final String id;
    private final String name;
    private final int age;
    private final String profession;


    public static AsterixDTO createAsterixDTO(String name, int age, String profession) {
        // Generate a random UUID as ID
        String id = UUID.randomUUID().toString();
        return AsterixDTO.builder()
                .id(id)
                .name(name)
                .age(age)
                .profession(profession)
                .build();
    }
}
