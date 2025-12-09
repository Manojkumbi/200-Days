const { add } = require("./es6.js");

function getUser(id, callback) {
    setTimeout(() => {
      console.log("User found");
      callback({ id: id, name: "John" });
    }, 1000);
  }
  
  function getPosts( callback) {
    setTimeout(() => {
      console.log("Posts retrieved");
      callback(["Post1", "Post2"]);
    }, 1000);
  }
  
  function displayPosts(posts) {
    console.log("User posts:", posts);
  }
  
  getUser(1, (user) => {
    getPosts(posts => {
      displayPosts(posts);
    });
  });

  console.log(add(21,22));
  
  