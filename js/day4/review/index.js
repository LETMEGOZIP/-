const arr = [10,20,30,40,50]

const arr1 = arr.map((x=>{
    return x > 30 ? x+100 : x+200
}))

console.log(arr1)

const arr2 = ["americano", "latte", "vanilla", "mocha", "mint", "tea"]
// const arr3 = arr2.map((x)=>{
//     return x.length <= 5 ? "coffeecon" : x.toUpperCase()})
// console.log(arr3)

const arr3 = arr2.map((x)=> x.length <= 5 ? "coffeecon" : x.toUpperCase())
console.log(arr3)


const add = (x,y) => x+y;
const sub = (x,y) => x-y; //return 한 줄인 경우 생략 가능