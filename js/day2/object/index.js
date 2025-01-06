// array:[] object: {}

const coffee = {
    name: "아메리카노",
    price: 3000,
    kcal: 1,
    origin: nigeria,
    isice: true,
    ingredients:["태운콩", "물"]
};

console.log(coffee.origin) // dot 접근법
console.log(coffee["shop"]) // bracket 접근법
console.log(cofee.maker) // 없으면undefined
console.log(coffee.ingredients[1]); //물

coffee.amount = 255

console.log(coffee.amount)

delete coffee.shop;