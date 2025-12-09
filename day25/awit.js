async function fetchData() {
    try {
        const data = await new Promise((resolve) => setTimeout(() => resolve("Data loaded"), 1000));
        console.log(data); 
    } catch (error) {
        console.error(error);
    }
}

fetchData();
