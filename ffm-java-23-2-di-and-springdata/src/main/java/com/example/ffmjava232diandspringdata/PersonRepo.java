package com.example.ffmjava232diandspringdata;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PersonRepo extends MongoRepository<Person, String> {

}
