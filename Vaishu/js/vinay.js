const POPULAR_ITEMS = [
  {
    id: "1",
    name: "Noodles",
    price: 50,
    image: "images/noodels.jpeg",
  },
  {
    id: "2",
    name: "Manchuria Noodles",
    price: 50,
    image: "images/MN.jpeg",
  },
  {
    id: "3",
    name: "Egg Puffs",
    price: 50,
    image: "images/egg-puffs.webp",
  },
  {
    id: "4",
    name: "Samosa",
    price: 50,
    image: "images/samosa.png",
  },
  {
    id: "3",
    name: "Veg Puffs",
    price: 50,
    image: "images/VegPuffs.webp",
  },
];

document.addEventListener("DOMContentLoaded", (e) => {
	POPULAR_ITEMS.forEach(item => {
		createCard(item)
	})

	POPULAR_ITEMS.forEach(item => {
		createCard(item)
	})
});


function createCard(data) {
  let card = `
		<div class="card" data-id="2" data-name="Manchurian Noodles" data-price="50" data-image="images/MN.jpeg">
            <div class="image_container">
               <img src="${data.image}" alt="Product Image" class="image" />
            </div>
            <div class="title">
               <span> ${data.name} </span>
            </div>
            <div class="size">
               <span>Quantity</span>
               <select class="quantity-select">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
               </select>
            </div>
            <div class="action">
               <div class="price">
                  <span> ${data.price} </span>
               </div>
               <button class="cart-button" onclick="addToCart()">
                  <span>Add to cart</span>
               </button>
            </div>
         </div>
	`;

	let item_grid = document.getElementById("item-grid");
	item_grid.innerHTML += card
}


function getItem() {
	fetch('http://localhost:3000/getItem', {
		method : 'GET',
	})
	.then(res => res.json())
	.then(response => {
		console.log(response);
		
	})
}


/// server apps
/// JS - ExpressJS - NodeJS
/// Java - Spring Boot ------  JDK
/// Python - Flask, Django, FastAPI ----- python
/// c#.NET - ASP


// Front end 
/// angular - typescript
/// React - JS