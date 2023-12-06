package com.example.ffmjava232asterixapi;

import jdk.internal.org.objectweb.asm.util.CheckClassAdapter;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;


import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AsterixServiceTest {

    AsterixRepo asterixRepo = mock(AsterixRepo.class);
    AsterixDTO asterixDTO = mock(AsterixDTO.class);
    AsterixService asterixService = new AsterixService();
    @Test
    void getAllCharacters_whenCalled_thenReturnAllCharacters() {

        // GIVEN
        List<Character> character = List.of(new Character("1", "Ivan", 30, "Web developer"));
        when(asterixRepo.findAll()).thenReturn(character);

        // WHEN
        List<Character> actual = asterixService.getAllCharacters();

        // THEN
        List<Character> expected = List.of(new Character("1", "Ivan", 30, "Web developer"));

        //verify(asterixRepo).findAll();
        assertEquals(expected,  actual);

    }

    @Test
    void addCharacter() {
    }

    @Test
    void testUpdateCharacter() {
    }

    @Test
    void deleteCharacter() {
    }
}