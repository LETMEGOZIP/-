const movies = ["베테랑 2", "에일리언", "독재의 시진핑"]


//const grades = {
//    grade:["일반", "커플", "프리미엄", "이코노미"]
//    price:[10000, 20000, 15000, 8000]}

//이 템플릿으로 뜯어고치고 movies 구조체로 다시 감싸도 됨

const grades = [
    {grade:"일반", price:10000},
    {grade:"커플", price:20000},
    {grade:"프리미엄",price:15000},
    {grade:"이코노미", price:8000},]
const popcorns = [
    {popcorn:"일반", price:6000},
    {popcorn:"캬라멜", price:6500},
    {popcorn:"치즈", price:6500},
    {popcorn:"반반", price:7500}]
const drinks = [
    {drink: "탄산", price:2000},
    {drink:"에이드", price:3000},
    {drink:"커피", price:3000}]

const sel1 = Number(prompt(`${movies} : 숫자로 고르시오`));
const sel2 = Number(prompt(`1. ${grades[0].grade}, 2. ${grades[1].grade}, 3. ${grades[2].grade}, 4. ${grades[3].grade} : 숫자로 고르시오`));
const sel3 = Number(prompt(`1. ${popcorns[0].popcorn}, 2. ${popcorns[1].popcorn}, 3. ${popcorns[2].popcorn}, 4. ${popcorns[3].popcorn} : 숫자로 고르시오`));
const sel4 = Number(prompt(`1. ${drinks[0].drink}, 2. ${drinks[1].drink}, 3. ${drinks[2].drink},  : 숫자로 고르시오`));
const age = Number(prompt(`나이 따라서 틀딱딸피 할인`));

const youngman = age <= 13;
const oldman = age >= 60;

const pricesum = grades[sel2-1].price + popcorns[sel3-1].price + drinks[sel4-1].price;
const order = movies[sel1-1] + ', ' + grades[sel2-1].grade + ', ' + popcorns[sel3-1].popcorn + ', ' + drinks[sel4-1].drink;

if(oldman){
    console.log(`${order}, 노인 할인 20%, 총 금액  ${pricesum*0.8}원 입니다`)
}

else if(youngman){
    console.log(`${order}, 풀피 할인 20%, 총 금액  ${pricesum*0.7}원 입니다`)
}

else{
    console.log(`${order}, 총 금액  ${pricesum}원 입니다`)
}