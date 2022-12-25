const request = require('request')
const cheerio = require('cheerio')
const fs = require('fs')

const url = "https://www.espncricinfo.com/series/south-africa-women-in-west-indies-2021-1273288/west-indies-women-vs-south-africa-women-5th-odi-1273422/full-scorecard";

request(url, callback);

function callback(err, resp, body){
    if(err){
        console.log(err);
    }else{
        winningTeamName(body);
    }
}

function winningTeamName(body){
    let $ = cheerio.load(body);

    let playerOfTheMatch = $('.playerofthematch-name')
    let teamNames = $('.event .team .name-detail');
    let teamScores = $('.event .score-detail>.score-info + .score');
    let loserTeam = $('.event .team.team-gray a').text()

    console.log("Player of the match - " + $(playerOfTheMatch[0]).text());

    let winningTeam = $(teamNames[0]).text() == loserTeam ? $(teamNames[1]).text(): $(teamNames[0]).text();
    // for(let i=0;i<teamNames.length;i++){
        // only valid for the matches that are not draw
    //     let len = $(teamNames[i]).children().length;
    //     if(len == 3){
    //         console.log("WINNER TEAM - " + $(teamNames[i]).text());
    //     }
    // }
    console.log(winningTeam);
}
