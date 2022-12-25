const request = require('request')
const cheerio = require('cheerio')
const fs = require('fs');

const url = "https://www.espncricinfo.com/series/south-africa-women-in-west-indies-2021-1273288/west-indies-women-vs-south-africa-women-5th-odi-1273422/full-scorecard";

request(url, callback);

function callback(err, resp, body){
    if(err){
        console.log(err);
    }else{
        birthdays(body);
    }
}

function birthdays(body){
    let $ = cheerio.load(body);
    let playerHrefs = $('.Collapsible__contentInner .table.batsman .batsman-cell .small');
    // let tablehtml = tables.html();

    // let table = `
    //             <table> 
    //                 ${$(tables[0]).html()}
    //              </table>
    //              <table> 
    //                 ${$(tables[1]).html()}
    //              </table>
    //              `
    // fs.writeFileSync("temp.html", table + "");
    let hrefsLink = [];
    for(let i=0;i<playerHrefs.length;i++){
        hrefsLink.push("https://www.espncricinfo.com" + $(playerHrefs[i]).attr("href"));
    }

    // console.log(hrefsLink);
    let data = []
    let count = 0;
    for(let i=0;i<hrefsLink.length;i++){
        request(hrefsLink[i], callbackFunc.bind(this, i));
    }

    function callbackFunc(index, err, resp, body){
        if(err){
            console.log(err);
        }else{
            birthdaysDates(index, body);
        }
    }
    function birthdaysDates(index ,body){
        let $ = cheerio.load(body);
        let playerDetailCard = $('.player-card-description.gray-900');
        let playerName = $(playerDetailCard[0]).text();
        let dob = $(playerDetailCard[1]).text();
        dob = dob.split(" ").splice(0,3).join(" ");

        data.push({
            name: playerName,
            DOB: dob
        });
        count++;
        if(hrefsLink.length == count){
            for(let i=0;i<data.length;i++){
                console.log(data[i]);
                // let playerObj = data[i];
                // console.log(`${playerObj.key} ${playerObj.name} - Date Of Birth ${(playerObj.DOB).splice(0,3)}`);
                // console.log(i);
            }
        }
    
    
    
        }
}



