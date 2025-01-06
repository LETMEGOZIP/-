const buses = [
    {bus:"마을버스", cost:1500},
    {bus:"시내버스", cost: 2000,},
    {bus:"고속버스", cost: 8000},
    {bus:"심야버스", cost: 10000}]

const regions = [
    {region:"경기권", cost:2000},
    {region:"충청권", cost:3000},
    {region:"강원권", cost:3000},
    {region:"제주권", cost:10000},
]

const grades = [
    {grade:"일반석", cost:1000},
    {grade:"프리미엄석", cost:3000},
    {grade:"넷플릭스석", cost:4000}
]

const sel1 = Number(prompt(`1. ${buses[0].bus} 2. ${buses[1].bus} 3. ${buses[2].bus} 4. ${buses[3].bus}  : 숫자로 고르시오`)) - 1;
const sel2 = Number(prompt(`1. ${regions[0].region} 2. ${regions[1].region} 3. ${regions[2].region} 4. ${regions[3].region} : 지역을 숫자로 고르시오`)) - 1;
const sel3 = Number(prompt(`1. ${grades[0].grade} 2. ${grades[1].grade} 3. ${grades[2].grade} : 숫자로 고르시오`)) - 1;

const age = Number(prompt(`나이 따라서 틀딱풀피 할인`));

const oldman = age >= 60;
const youngman = age <= 13;

const total_price = buses[sel1].cost + regions[sel2].cost + grades[sel3].cost;

if(oldman){
    console.log(`${regions[sel2].region} ${buses[sel1].bus} ${grades[sel3].grade}이며, 노인 할인을 포함 총 금액은 ${total_price*0.5}원입니다.`);
}
else if(youngman){
    console.log(`${regions[sel2].region} ${buses[sel1].bus} ${grades[sel3].grade}이며, 소인 할인을 포함 총 금액은 ${total_price*0.2}원입니다.`);
}
else{
    console.log(`${regions[sel2].region} ${buses[sel1].bus} ${grades[sel3].grade}이며, 총 금액은 ${total_price}원입니다.`);
}