package com.example.ffmjava232diandspringdata;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class PersonService {

    private final PersonRepo repo;

    public List<Person> getAllPersons() {
        return repo.findAll();
    }

    public Person findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not fund"));
    }
}
