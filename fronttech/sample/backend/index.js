const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');
const app = express();

const otherErr = 403;

let myUser = {userid: "JS00001", name: "test", sex: 0, };

app.use(express.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, '../fontend')));
app.use(bodyParser.json());

app.all('*', function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "X-Requested-With, content-type, Authorization");
    res.header("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
    res.header("X-Powered-By",' 3.2.1')
    res.header("Content-Type", "application/json;charset=utf-8");
    if(req.method.toLocaleLowerCase() === 'options'){
        res.status(204);
        return res.json({});
    }else{
        next();
    }

});

// get myUser
app.get('/getUser', async (req, res) => {
    return res.json({code: 0, msg: "", userid: myUser.userid, name: myUser.name, sex: myUser.sex,});
});

// update myUser
app.post('/update', async (req, res) => {
  try {
    console.log(req.body);
    myUser.name = req.body.name;
    myUser.sex = req.body.sex;
    return res.json({code: 0, msg: "", userid: myUser.userid, name: myUser.name, sex: myUser.sex,});
  } catch(e) {
    console.log(`update err [${e}]`);
    return res.json({code: otherErr, msg: "update err",});
  }
});

const port = 3001;
app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

module.exports=app;
