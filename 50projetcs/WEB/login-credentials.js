const cheerio = require('cheerio')
const request = require('request')

const url = "https://noteshub.co.in/auth"
request(url, (err, resp, body)=>{
    if(err){
        console.error(err);
    }else{
        login(body);
    }
});

const demo_id = "neel12@gmail.com";
const demo_password = "abc@12345";

// implementing google authentication with node js
 
function login(body){
    selectorTool = cheerio.load(body);
    // selectorTool('input[placeholder="Email"]').text(demo_id);
    selectorTool('.p-button-label').onClick()
    // console.log(selectorTool('input[placeholder="Email"]').text());


}