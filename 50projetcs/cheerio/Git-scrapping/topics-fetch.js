const cheerio = require('cheerio')
const request = require('request')

let url = "https://github.com/topics"

request(url, requestCallback);

function requestCallback(err, resp, html) {
    if(err){
        console.error(err);
    }else{
        fetchIssues(html);
    }
}

function fetchIssues(html) {
    const $ = cheerio.load(html);
    let topicsUrlAnchorTags = $(".no-underline.d-flex.flex-column");
    let urlTags = [];
    for(let i in topicsUrlAnchorTags){
        urlTags.push(
            $(topicsUrlAnchorTags[i]).attr("href")
        )
    }
    console.log(urlTags);

}