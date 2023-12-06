export interface Character {
    id: number;
    name: string;
    status: string;
    species: string;
    image: string;
}

// Function to fetch characters from the API
export const fetchCharacters = async (): Promise<Character[]> => {
    try {
        const response = await fetch('https://rickandmortyapi.com/api/character/');
        const data = await response.json();
        return data.results;

    } catch (error) {
        console.log(error)
        return [];
    }
};