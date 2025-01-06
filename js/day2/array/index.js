// 기본 타입 : String, Number, Boolean, Null, Undefined
// 참조 타입 : Array

//Array:[] 배열
const paik0 = ["아메리카노", "라떼", "모카", "바닐라"];
console.log(paik0);
console.log(paik0[2]);

//서브웨이
//빵메뉴[플랫,위트,화이트]
//치즈메뉴[슈레드, 모짜렐라, 아메리칸 치즈]
//소스메뉴[머스타드, 핫칠리, 소금, 후추, 스언, 홀레]
//쿠키 [화이트, 초코, 아몬드]
//음료 [콜라, 제로, 스프라이트, 커피]

const bread = ["플랫","위트","화이트"]
const cheese = ["슈레드", "모짜렐라", "아메리칸 치즈"]
const sauce = ["머스타드", "핫칠리", "소금", "후추", "스언", "홀레"]
const cookie = ["화이트", "초코", "아몬드"]
const juice = ["콜라", "제로", "스프라이트", "커피"]

const pick0 = prompt(`${bread} 숫자로 골라`)
const pick1 = prompt(`${cheese}`)
const pick2= prompt(`${sauce}`)
const pick3= prompt(`${cookie}`)
const pick4= prompt(`${juice}`)

console.log(`최종 메뉴는 ${bread[pick0-1]} - ${cheese[pick1-1]} - ${sauce[pick2-1]} - ${cookie[pick3-1]} - ${juice[pick4-1]}`)