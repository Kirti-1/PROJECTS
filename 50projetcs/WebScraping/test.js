const request = require('request');
const cheerio = require('cheerio');

const url = "https://time.com/5660278/smartphone-camera-picture-tips/"
request(url, (err, res, body) => {
    if(err){
        console.log(err);
    }else{
        extractImg(body);
    }
});

function extractImg(body) {
    let $ = cheerio.load(body);
    let src = $('.inner-container.js-inner-container');
    for(let i=0;i<src.length;i++){
        console.log($(src[i]).find('img').attr('src'));
    }
}

