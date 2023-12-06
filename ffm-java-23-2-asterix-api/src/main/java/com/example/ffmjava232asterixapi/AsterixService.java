package com.example.ffmjava232asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsterixService {

    @Autowired
    private AsterixRepo repo;

    List<Character> getAllCharacters() {
        return repo.findAll();
    }

    public Character addCharacter(Character character) {
        return repo.save(character);
    }

    public Character updateCharacter(String id, Character updatedCharacter) {
        if(repo.existsById(id) ){
            updatedCharacter = updatedCharacter.withId(id);
            return repo.save(updatedCharacter);
        } else {
            return  null;
        }
    }

    public void deleteCharacter(String id) {
        repo.deleteById(id);
    }

    public List<Character> saveCharacter(List<Character> character) {
        return repo.saveAll(character);
        //return repo.findAll();
    }

    public int getAverageAgeByProfession(String profession) {
        List<Character> characters = repo.findByProfession(profession);

        if (characters.isEmpty()) {
            return 0; // Handle the case where no characters with the given profession are found
        }

        int totalAge = characters.stream()
                .mapToInt(Character::age)
                .sum();
        return  totalAge / characters.size();
    }

    public AsterixDTO createAsterixDTO(Character character) {
        return AsterixDTO.createAsterixDTO(character.name(), character.age(), character.profession());
    }
}
