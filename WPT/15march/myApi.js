const http = require('http');
const url = require('url');

const s1 = http.createServer(handleData);
let myData = [12, 23, 34, 56, 78];
function handleData(request, response) {

    console.log(request.method)

    if (request.method == 'GET') {

        if (request.url == '/') {
            response.write("Hello From Server")
        }

        if (request.url == '/getData') {
            response.write("Data " + myData)
        }


    }
    // add the data 
    if (request.method === 'POST') {
        const urlData = url.parse(request.url, true)
        console.log(urlData)
        const queryParams = urlData.query;
        let data = queryParams.num;

        console.log(urlData.pathname)
        // parse 

        if (urlData.pathname === '/home') {
            response.write("Home Page")
            myData.push(data);
        }

    }

    response.end();



}

s1.listen(5050, () => {

    console.log("Server Started ")

});