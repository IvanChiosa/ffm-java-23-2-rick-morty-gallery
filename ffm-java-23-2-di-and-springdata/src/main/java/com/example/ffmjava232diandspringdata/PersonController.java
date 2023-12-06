package com.example.ffmjava232diandspringdata;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor

public class PersonController {

    private final PersonService service;

    @GetMapping
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }
}
