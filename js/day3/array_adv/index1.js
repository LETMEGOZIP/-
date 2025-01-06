const addten = (x)=>{return x+10}

const sqr = (x)=>{
    return x**x;
}

// 배열 요소 바꾸기 함수
const num = [1,2,3,4,5].map(addten)
const num1 = [1,2,3,4,5].map(sqr)
const num2 = [1,2,3,4,5].map((x)=>{return x + 100})

console.log(num)
console.log(num1)