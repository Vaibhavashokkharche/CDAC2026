fetch('https://fakestoreapi.com/products/1')
.then(response=>console.log(response.json()))
.then(data=>console.log(data))
.catch(error=>console.log(error));

