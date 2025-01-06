const tw = (x)=>{
    return x*2;
}

const twothree = (x)=>{
    return x%2==0 ? x*3 : x*2
}

const thun = (x)=>{
    return x>=3 ? "cherry" : "watermelon"
}

const num = [1,2,3,4,5]

const num1 = num.map(tw)
const num2 = num.map(twothree)
const num3 = num.map(thun)

console.log(num1)
console.log(num2)
console.log(num3)

const frar = ["watermelon", "cherry", "banana", "avocado", "apple", "apple", "orange", "pineapple", "strawberry"]

const frar1 = frar.map((x)=>{
    return x.length >= 7 ? x.toUpperCase() : x.toLowerCase();
})

const frar2 = frar.map((x)=>{
    return x.includes("a") ? x.toUpperCase() : x.toLowerCase();
})

const frar3 = frar.map((x)=>{
    return x.replaceAll("a", "CHR")
})

console.log(frar1)
console.log(frar2)
console.log(frar3)

const starbucks = [
    {name:"americano", price:4500, shots:2, ingredients:["water", "beans"]},
    {name:"latte", price:6000, shots:2, ingredients:["milk", "beans"]},
    {name:"javachip", price:6500, shots:2, ingredients:["water", "wheat", "beans"]},
    {name:"honeytea", price:5700, shots:1, ingredients:["grape", "water", "sauce"]}];

const starbucks_autumn = starbucks.map((x)=>{
    x.price = x.price*0.9;
    return x;
})

console.log(starbucks_autumn)

const starbucks_soy = starbucks.map((x)=>{
    x.ingredients.push("soy");
    return x;
})

console.log(starbucks_soy)

const starbucks_aa = starbucks.map((x)=>{
    if(x.name.includes("americano")){
        x.price = x.price*0.8;
        x.shots = x.shots + 1;
        return x;
    }
    else{
        return x;
    }
})

console.log(starbucks_aa)

const starbucks_inf = starbucks.map((x)=>{
    x.price = x.price * 1.2;
    return x;
})

console.log(starbucks_inf)