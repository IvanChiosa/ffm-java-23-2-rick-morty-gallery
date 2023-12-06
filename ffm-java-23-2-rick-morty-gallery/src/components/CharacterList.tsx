import React, {useEffect, useState} from "react";
import {Character, fetchCharacters} from "./RickMorty.tsx";
import './CharacterList.css'

const CharacterList: React.FC = () => {
    const [characters, setCharacters] = useState<Character[]>([]);

    useEffect(() => {
        const fetchdata = async () => {
            const charactersData = await fetchCharacters();
            setCharacters(charactersData);
        };
        fetchdata();
    }, []);



    return (
        <>
            <div className="character-list">
                <h1>Character List Rick&Morty </h1>
                <ul className="characters-container">
                    {characters.map((character) => (
                        <li key={character.id} className="character-item">
                            <div className="character-block">
                                <img
                                    src={character.image}
                                    alt={character.name}
                                    className="character-image"
                                />
                                <div className="character-info">
                                    <p>ID: {character.id}</p>
                                    <p>Name: {character.name}</p>
                                    <p>Species: {character.species}</p>
                                    <p>Status: {character.status}</p>
                                </div>
                            </div>
                        </li>
                    ))}
                </ul>
            </div>
        </>
    )
}

export default CharacterList;