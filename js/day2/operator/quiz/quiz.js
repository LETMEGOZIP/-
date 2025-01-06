const birth = prompt("출생년도: ");
const msg = birth <= 2005 ? "성인" : "미성년"
console.log(msg)

const height = prompt("키 : ")
const msg1 = height <= 150 ? "탈 수 없다" : "탈 수 있다"
console.log(msg1)


const num = prompt("양의 정수 : ")
const sec = num%60;
const min = parseInt(num/60);
console.log(`${min}분 ${sec}초`);