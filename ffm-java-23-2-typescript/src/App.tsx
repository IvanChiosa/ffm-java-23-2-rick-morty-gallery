import './App.css'

function App() {

    const age: number = 25;

    for (let i: number = 1; i <= age; i++) {
        if (age > 18) {
            console.log("You are an adult + 18");
        } else {
            console.log("You are not an adult!");
        }
    }

    const score: number = 0;
    if (score !== 0) {
        console.log("Score is available");
    }

    if (score) {
        console.log("Score is evaluated as truthy.");
    } else {
        console.log('Score is not evaluated as truthy.');
    }

    const username: string = " ";
    if (username) {
        console.log("Username is available.");
    } else {
        console.log("Username is not available.");
    }

    if (!username) {
        console.log('Username is evaluated as falsy.');
    } else {
        console.log('Username is not evaluated as falsy.');
    }

    const isAdmin: boolean = false;
    if (isAdmin) {
        console.log("isAdmin is evaluated as truthy");
    } else {
        console.log("isAdmin is evaluated not as truthy");
    }

    if (!isAdmin) {
        console.log("isAdmin is evaluated as falsy");
    }


    function drawChristmasTree(n: number): void {
        for (let i = 1; i <= n; i++) {
            const spaces = ' '.repeat(n - i);
            const stars = '*'.repeat(2 * i - 1);
            console.log(spaces + stars);
        }

        // Print the tree trunk
        const trunkSpaces = ' '.repeat(n - 1);
        console.log(trunkSpaces + '*');
        console.log(trunkSpaces + '*');
        console.log(trunkSpaces + '*');
        console.log(trunkSpaces + '*');
        console.log(trunkSpaces + '*');
    }

// Call the function with n = 5
    drawChristmasTree(5);



    function sum1(x: number, y: number): number {
        return x + y;
    }


    return (
        <>
            <h1>Hello World</h1>
            <h2>{sum1(5,2)}</h2>
        </>
    )
}

export default App
