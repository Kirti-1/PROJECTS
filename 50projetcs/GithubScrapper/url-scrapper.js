const cheerio = require('cheerio')
// const fs = require('fs');


function fetchUrlCallback(html) {
    return randomTopicsUrls(html);
}

let urlsArray = [];
function randomTopicsUrls(html){
    let $ = cheerio.load(html);
    let urlContainer = $('.d-flex.flex-wrap.flex-justify-start a');
    // console.log(urlContainer.length);
    

    for(let i=0;i<urlContainer.length;i++){
        let url = `https://github.com${$(urlContainer[i]).attr('href')}`;
        urlsArray.push(url);
    } 

    return urlsArray;
    
    // fs.writeFile("url.txt", urlsArray.join('\n'), (err)=> {
    //     if(err){
    //         console.log(err);
    //     }
    // });
    // console.log(urlsArray); 
}

module.exports = {
    fetchurl : fetchUrlCallback
};