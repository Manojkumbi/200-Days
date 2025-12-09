const express= require("express");
const app=express();
try {
    app.get("/",(req,res)=>{
        res.send("<h1>hihiiiiii</h1>")
    })
} catch {
    app.get("/:name",(req,res)=>{
        res.send(req.params.name)
    })
}




app.post("/",(req,res)=>{
  
        res.send("jklmn")
   
   
})


app.listen(3000,()=>{
    console.log(3000);
    
})