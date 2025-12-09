const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve("Data fetched successfully");
    }, 1000);
});

promise
    .then((data) => console.log(data))     // Output: "Data fetched successfully"
    .catch((error) => console.log(error));
