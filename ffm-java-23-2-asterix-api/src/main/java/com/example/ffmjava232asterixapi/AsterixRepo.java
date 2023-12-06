package com.example.ffmjava232asterixapi;

import lombok.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AsterixRepo  extends MongoRepository<Character, String> {

    @Query("{ 'profession' : ?0 }")
    List<Character> findByProfession(String profession);

    public Optional<Character> findByName(String name);

}
