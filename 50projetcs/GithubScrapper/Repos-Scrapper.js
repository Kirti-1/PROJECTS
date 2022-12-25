const urlscrapper = require('./url-scrapper');
const request = require('request');
const cheerio = require('cheerio');
const fs = require('fs');



const url = "https://github.com/topics";

request(url, callbackfunc);
function callbackfunc(err, resp, html) {
    if(err){
        console.log(err);
    }else{
        let randTopicsUrls = urlscrapper.fetchurl(html);
        // console.log(randTopicsUrls);
        repoUrls(randTopicsUrls)
    }
}

let allrepos = []

// Atmost Top 8 repos-scrapper
function repoUrls(urls){
    console.log(urls);
    for(let i=0;i<urls.length;i++){
        allrepos.push({
            "Topic": urls[i],
            "Repos":[]
        })
        
        request(urls[i], top8urls.bind(this, i))
    }
}

let countUrl = 0;

function top8urls(index, err, resp, html) {
    $ = cheerio.load(html);
    let reposContainer = $('.border.rounded.color-shadow-small .text-bold.wb-break-word') 
    let urlRepos = []
    for(let i=0;i<8 && i<reposContainer.length;i++){
        allrepos[index]["Repos"].push({
            "RepoUrl": "https://www.github.com"+ $(reposContainer[i]).attr('href'),
            "Issues":[]
        })
    }    
    
    countUrl++;

    if(countUrl == 3){
        fs.writeFileSync("temp.json", JSON.stringify(allrepos));
    }
}





