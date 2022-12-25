const request = require('request');
const cheerio = require('cheerio'); 

request("https://www.espncricinfo.com/series/ipl-2020-21-1210595/match-results", callback);

function callback(err, resp, body) {
    return fetchScoreCards(body);
}

function fetchScoreCards(body) {
    let $ = cheerio.load(body);
    let scorecardhrefs = $('.team-scores-page .card.content-block.league-scores-container .match-cta-container a');
    
    let scorecard = []
    for(let i=2;i<scorecardhrefs.length;i+=4){
        scorecard.push(
            "https://www.espncricinfo.com"+ $(scorecardhrefs[i]).attr('href')
        )
    }

    // extract out 60 Score-Ids
    scorecard = scorecard.map((sc)=>{
        let matchNumber = (((sc.split('/'))[5]).split('-'));
        return matchNumber[matchNumber.length-1];
    });
    // 60 matches score Ids 
    console.log(scorecard);

}

