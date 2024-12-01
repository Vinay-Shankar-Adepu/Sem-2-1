let express = require('express')
let app = express();
app.get("/",(req,res)=>{
    res.send("Hello KMIT!!");
});
app.listen(5000,()=>{
    console.log("backend is listening");
})