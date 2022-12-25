const request = require('request');
const cheerio = require('cheerio');
const chalk = require('chalk');
const fs = require('fs');

const url = "https://www.imdb.com/india/?ref_=ib_g_in_g_gg_kwd-14898322_cv";

request(url, (err, res, body) => {
    if(err){
        console.log(err);
    }else{
        MostAnticipatedMovies(body);
    }
});


function MostAnticipatedMovies(body) {
    let $ = cheerio.load(body);
    let heading = $('.trending-title').text();
    console.log(chalk.magenta(heading));
    let details = $('.trending-list-rank-items-container').html();
    let namesArr =$(details).find('.trending-list-rank-item-name');
    let viewsArr =$(details).find('.trending-list-rank-item-share');
    for(let i=0;i<namesArr.length;i++){
        task(namesArr, viewsArr, i, $);
    }
}

function task(namesArr, viewsArr, i, $){
    setTimeout(() =>{
        console.log(`${i+1}. ${chalk.yellow($(namesArr[i]).text())}  - ${$(viewsArr[i]).text()}`);
        let storylineLink = "https://www.imdb.com/" + $(namesArr[i]).find('a').attr('href');
        story_line(storylineLink);
    },4000*i)
}

function story_line(link) {
    request(link, function callback(err, res, body) {
        if(err){
            console.error(err);   
        }else{
            storylineContent(body);
        }
    });
    
}
let i = 1;
function storylineContent(body) {
    
    let $ = cheerio.load(body);
    fs.writeFile(`content${i}.txt`, $+"", function cb(err){
        if(err){
            console.log(err);
        }
    });
    let content = $('.ipc-html-content').text();
    console.log(chalk.redBright(content));
    i++;
}