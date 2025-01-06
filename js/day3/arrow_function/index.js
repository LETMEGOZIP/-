// General function[구문법]
function add(x,y){
    return x+y;
}

function subtract(x,y){
    return x-y;
}

// Arrow function[신문법]
//()=>{}
const add1 = (x,y)=>{return x+y}
const sub1 = (x,y)=>{return x-y}

const ice = (x)=>{return(`${x}맛 아이스크림`)}
const txtarr = (x,y,z)=>{return [x, y, z]}
const oddeven = (x)=> {return x%2==1 ?  "홀" : "짝"}