const express = require('express')
const app = express()

var cors = require('cors')

app.use(cors())

app.get('/', function (req, res) {
  res.send('Hello World')
})


app.get('/getItem', (req, res) => {
   res.json({
      id : 1,
      name : 'Vinay',
      price : 50000,
   })
})

app.listen(3000, () => {
   console.log('Server listening on port 3000'); 
})