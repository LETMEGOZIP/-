//String, Number, Boolean, Array
const arr = ["Samsung", "LG", "Apple", "Google"]

arr.push("Hyundai") // Hyundau 뒤에 추가
arr.unshift("Hybe") // Hybe 앞에 추가
arr.pop() // 맨뒤에거 폭발
arr.shift() // 맨 앞에 요소 빼기
arr.reverse() // 배열 거꾸로
arr.indexOf("LG") // 1
arr.indexOf("toyota") // -1
arr.includes("Google") // true false

const news = prompt("기사 전문")
const keyword = prompt("찾을 단어 입력")
const newssplit = news.split(" ")
if (newssplit.includes(keyword)){alert("있다!")}
else{alert("없다!")}

