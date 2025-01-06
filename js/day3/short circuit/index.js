//short circuit

const a = false || true

const b = false || "마라탕 "; //마라탕

const c = false || false || false || "치즈";

const d = undefined || "자바스크립트"

const username = prompt ("유저 이름 입력: ")

alert (`${username} || "Guest"님 환영합니다.`)

// &&[and]

const e = true && "탕수육";
const f = false && "탕후루";

const isLoggin = prompt("비밀번호 입력") == "1234"
isLoggin && alert ("ㅎㅇ");