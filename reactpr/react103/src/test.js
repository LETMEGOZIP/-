//1. spread

// 1) 문자열
const spreadArray = [..."coffee"]

// 2) rest
const fruits =["apple", "orange", "kiwi", "graoe"]

const apple = fruits[0]

const [first, second, third] = fruits

const [a,...b] = fruits // apple, ["orange", "kiwi", "grape"]


// // -> ics_americano -> i a
// const [ice, coffee] ="ice_americano".split("_") //['ice', 'americano']
// const [first1] = [...ice]
// const [first2] = [...coffee]

const person = {name:"차은우", age : 28, agency:"판타지오"}

//const {name} = person;

const {name, ...other} = person //name:차운우 other{age:28, agency"판타지오"}

const son = {name:"손흥민", position:"윙"}
const tottham = {clut:"토트넘", number:7}
const korea = {nation : "대한민국", number:10}

const a0 = {son, tottham} //{이름손흥민 포지션윙}, {클럽 토트넘, 7번}
const a1 = {...son, ...tottham} // {name:"손흥민", position:"윙", 클ㄹ버톹트넘 7번}
const a2 = {...son, ...korea}// {이름손흥민, 포지션윙, 국가한국, 10번}

const coffeeName = "아메리카노"
const coffeeShots = 2

//k값과  v값이 같으면 한 단어 가능
const coffee1 = {
    coffeeName: coffeeName,
    coffeeShots:coffeeShots,
}