
// [1,2,3,4,5,6,7,8,9,10].filter((x)=>{
//     return x%3==0
// })

// [1,2,3,4,5,6,7,8,9,10,11].filter((x)=>{
//     return 4<=x && x <= 8
// })

const fruitarray = [
    "watermelon",
    "cherry",
    "banana",
    "avocado",
    "apple",
    "orange",
    "pineapple",
    "strawberry"
]

const fruit1 = fruitarray.filter((x)=>{
    return x.includes("o")
})

const fruit2 = fruitarray.filter((x)=>{
    return x.length >=6
})

const fruit3 = fruitarray.filter((x)=>{
    return x.length %2 == 0
}).map((x)=>{
    return x.toUpperCase();
})
//메소드 체이닝


// const a = Number(prompt("정수 입력"))
// const b = Number(prompt("정수2 입력"))
// const multi = (a,b)=>{
//     return Array(n)
//     .fill(0) // [0,0,0,0,0,0]
//     .map((x,i)=>{
//         return i+1
//     })
//     .filter((x)=>{
//         return x%b == 0;
//     }) //[3,6,9]
// }

// console.log(multi(a,b))

// const todolist = ["점심", "복습", "유튜브", "카톡"]
// const finished = [false, false, true, true]

// todolist.filter((x,i)=>{
//     return !finished[i]
// })

// const newtodo = (todolist, finished) =>{
//     return todolist.filter((x,i)=>{
//         return !finished[i]
//     })
// }

const xabc = "xabcxdefxghi"
const abcarray = xabc.split("x").map((x)=>x.length)

const test2 = (word) =>{xabc.split("word").map((x)=>word.length)};



const fruits = ["melon", "kiwi", "apple", "banana", " orange"]
const melon ="melon"
melon.split("").map((x)=>{
    x == 'a' || x== 'e' || x=='i' || x=='o' || x=='u' ? x.toUpperCase: x
})

const vowels = ["a", "e", "i", "o", "u"]

const riktfruit = fruits.map((x)=>
    x
.split("")
.map((y)=>{
    y == 'a' || y== 'e' || y=='i' || y=='o' || y=='u' 
    ? y.toUpperCase
    : y}));

const riktfruit2 = fruits.map((x)=> x.split("").map((y)=>
     vowels.some((v)=>v == y) ? y.toUpperCase : y))

// 해당 타입으로 답 없을 때는 변환해서

const hun = Array(100).fill().map((x,i)=>String(i+1)).map((x)=> x.includes("3") || x.includes("6") || x.includes("9") ? "clap" : x)
   

console.log(hun);