const request = require('request');
const cheerio = require('cheerio');
const fs = require('fs');
const xlsx = require('xlsx');
let newWb = xlsx.utils.book_new();

request("https://www.espncricinfo.com/series/ipl-2020-21-1210595/match-results", (err, resp, body) => {
    console.log("hello");
    fetchScoreCards(body);
});

function fetchScoreCards(body) {
    let $ = cheerio.load(body);
    let scorecardhrefs = $('.team-scores-page .card.content-block.league-scores-container .match-cta-container a');
    let scorecard = []
    
    for(let i=2;i<scorecardhrefs.length;i+=4){
        scorecard.push(
            "https://www.espncricinfo.com"+ $(scorecardhrefs[i]).attr('href')
        )
    }
    for(let i=0;i<scorecard.length;i++){
        let url = scorecard[i];
        let matchNumber = (((url.split('/'))[5]).split('-'));
        let mn = matchNumber[matchNumber.length-1];
        request(url, (err, resp, body)=>{ 
            extractTable(mn, body);
        })
    }
}

let index = 1;

function extractTable(mn, body) {
    let $ = cheerio.load(body);

    let batsmanTableBodyTeam1 = $($('.Collapsible__contentInner .table.batsman tbody')[0]);
    let bowlerTableBodyTeam1 = $($('.Collapsible__contentInner .table.bowler tbody')[0]);
    let bowlerTableBodyTeam2 = $($('.Collapsible__contentInner .table.bowler tbody')[1]);
    let batsmanTableBodyTeam2 = $($('.Collapsible__contentInner .table.batsman tbody')[1]);

    


    /********************************** Team-1 Batting Table **************************************************/
    let team1Candidates = batsmanTableBodyTeam1.find('tr');
    let team1BodyContent = [];
  
    let head = $($('.Collapsible__contentInner .table.batsman thead tr')[0]).find('th')
    let ans = [];
    for(let i=0;i<head.length;i++){
        
        ans.push($(head[i]).text());
    }
    team1BodyContent.push(ans);
    for(let row=0;row<team1Candidates.length-1;row++){
        let firstRow = $(team1Candidates[row]).find('td');
        ans = []
        for(let i=0;i<firstRow.length;i++){
            ans.push($(firstRow[i]).text());
        }
        team1BodyContent.push(ans);
    }
    let total1 = $($('.Collapsible__contentInner .table tfoot .thead-light.bg-light.total')[0]).find('td');
    let tfoot1 = [];

    for(let f=0;f<total1.length;f++){
        tfoot1.push($(total1[f]).text());
    }
    team1BodyContent.push(tfoot1);

    let final_Ansteam1 = [];
  
    for(let i=1;i<team1BodyContent.length-1;i++){
        if(i%2!=0){
            final_Ansteam1.push({
                "Batting": team1BodyContent[i][0],
                "R": team1BodyContent[i][2],
                "B": team1BodyContent[i][3],
                "4s": team1BodyContent[i][5],
                "6s": team1BodyContent[i][6],
                "SR": team1BodyContent[i][7]
            });
        }
    }
    final_Ansteam1.push({
        "Batting": tfoot1[0],
        "R":tfoot1[2],
        "B":tfoot1[3],
        "4s":tfoot1[3],
        "6s":tfoot1[3],
        "SR":tfoot1[1]
    })

    let sheetName1 = `${mn}_${index}Batting1`;
    let newWs1 = xlsx.utils.json_to_sheet(final_Ansteam1);
    xlsx.utils.book_append_sheet(newWb, newWs1, sheetName1);

    /********************************** Team -1 Bowling Table *************************************************/

    
    let team1Bowlers = bowlerTableBodyTeam1.find('tr');
    let team1BowlersContent = [];
    for(let row=0;row<team1Bowlers.length;row++){
        let firstRow = $(team1Bowlers[row]).find('td');
        ans = []
        if(firstRow.length == 1){
            continue;
        }
        for(let i=0;i<firstRow.length;i++){
            ans.push($(firstRow[i]).text());
        }
        team1BowlersContent.push(ans);
    }
    let final_Ansteam1bow = [];
    for(let i=0;i<team1BowlersContent.length;i++){
        final_Ansteam1bow.push({
            "Bowling": team1BowlersContent[i][0],
            "O": team1BowlersContent[i][1],
            "M": team1BowlersContent[i][2],
            "R": team1BowlersContent[i][3],
            "W": team1BowlersContent[i][4],
            "ECON": team1BowlersContent[i][5],
            "WD": team1BowlersContent[i][9],
            "NB": team1BowlersContent[i][10]

        });
    }

    let sheetName2 = `${mn}_${index}Bowling1`;
    let newWs2 = xlsx.utils.json_to_sheet(final_Ansteam1bow);
    xlsx.utils.book_append_sheet(newWb, newWs2, sheetName2);
    


    /********************************** Team -2 Batting Table **************************************************/
    
    let team2Candidates = batsmanTableBodyTeam2.find('tr');
    let team2BodyContent = [];
    head = $($('.Collapsible__contentInner .table.batsman thead tr')[1]).find('th');

    let ans2 = [];
    for(let i=0;i<head.length;i++){
        ans2.push($(head[i]).text());
    }
    team2BodyContent.push(ans);
    for(let row=0;row<team2Candidates.length-1;row++){
        let firstRow = $(team2Candidates[row]).find('td')
        ans2 = [];
        for(let i=0;i<firstRow.length;i++){
            ans2.push($(firstRow[i]).text());
        }
        team2BodyContent.push(ans2);
    }

    let total2 = $($('.Collapsible__contentInner .table tfoot .thead-light.bg-light.total')[1]).find('td');
    let tfoot2 = [];

    for(let f=0;f<total2.length;f++){
        tfoot2.push($(total2[f]).text());
    }
    team2BodyContent.push(tfoot2);

    let final_Ansteam2 = [];
  
    for(let i=1;i<team2BodyContent.length-1;i++){
        if(i%2!=0){
            final_Ansteam2.push({
                "Batting": team2BodyContent[i][0],
                "R": team2BodyContent[i][2],
                "B": team2BodyContent[i][3],
                "4s": team2BodyContent[i][5],
                "6s": team2BodyContent[i][6],
                "SR": team2BodyContent[i][7]
            });
        }
    }
    final_Ansteam2.push({
        "Batting": tfoot2[0],
        "R":tfoot2[2],
        "B":tfoot2[3],
        "4s":tfoot2[3],
        "6s":tfoot2[3],
        "SR":tfoot2[1]
    });

    let sheetName3 = `${mn}_${index}Batting2`;
    let newWs3 = xlsx.utils.json_to_sheet(final_Ansteam2);
    xlsx.utils.book_append_sheet(newWb, newWs3, sheetName3);


    /********************************** Team-2 Bowling Table *************************************************/

    let team2Bowlers = bowlerTableBodyTeam2.find('tr');
    let team2BowlersContent = [];
    for(let row=0;row<team2Bowlers.length;row++){
        let firstRow = $(team2Bowlers[row]).find('td');
        ans = []
        if(firstRow.length == 1){
            continue;
        }
        for(let i=0;i<firstRow.length;i++){
            ans.push($(firstRow[i]).text());
        }
        team2BowlersContent.push(ans);
    }
    let final_Ansteam2bow = [];
    for(let i=0;i<team2BowlersContent.length;i++){
        final_Ansteam2bow.push({
            "Bowling": team2BowlersContent[i][0],
            "O": team2BowlersContent[i][1],
            "M": team2BowlersContent[i][2],
            "R": team2BowlersContent[i][3],
            "W": team2BowlersContent[i][4],
            "ECON": team2BowlersContent[i][5],
            "WD": team2BowlersContent[i][9],
            "NB": team2BowlersContent[i][10]

        });
    }
    
    let sheetName4 = `${mn}_${index}Bowling2`;
    let newWs4 = xlsx.utils.json_to_sheet(final_Ansteam2bow);
    xlsx.utils.book_append_sheet(newWb, newWs4, sheetName4);

    index++;


    /************************************************ workbook naming - excel *********************************************/
    if(index == 61){
        xlsx.writeFile(newWb, 'Cricinfo.xlsx');
    }
}

