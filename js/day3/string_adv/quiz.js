// const a = "it" || "IT" // it
// //includes("it"||"IT") 해봤자 it만 들어감

// const passset = prompt("설정할 비밀번호 입력")
// const passcheck = passset.includes("it") || passset.includes("IT")
// passcheck==true ?  console.log("설정완료") : console.log ("설정오류")

// const food = prompt("좋아하는 음식: ")
// alert(`${food.repeat(5)}`);

// const food2 = prompt("좋아하는 음식이랑 횟수: ")
// const arr = food2.split(" ")
// alert(`${arr[0].repeat(arr[1])}`);

// const aword = prompt("단어 입력: ")
// const count = aword.length;
// count > 6 ? alert(`${aword.toUpperCase()}`): alert(`${aword.toLowerCase()}`)

const news =`Left-leaning politician Anura Kumara Dissanayake has won Sri Lanka’s presidential election after a historic second round of counting.
No candidate won more than 50% of the total votes in the first round, where Dissanayake got 42.31% while his closest rival, opposition leader Sajith Premadasa, got 32.76%.
But Dissanayake, who promised voters good governance and tough anti-corruption measures, emerged as winner after the second count, which tallied voters' second and third choice candidates.
The election on Saturday was the first to be held since mass protests unseated the country's leader, Gotabaya Rajapaksa, in 2022 after Sri Lanka suffered its worst economic crisis.`

//alert(news.split(" "))

//const word = prompt("단어입력: ")

const word = prompt("단어 입력")
const result1 = word == word.toUpperCase() ? word.toLowerCase() : word.toUpperCase();
alert(result1)

const pw = prompt("비번입력: ")
const lcheck= pw.length >= 8 && pw.length <=20
const spcheck = pw.includes("&") || pw.includes("#") || pw.includes("@") || pw.includes("!")
const stcheck = pw.startsWith("it") || pw.startsWith("IT")
if(!lcheck){alert("길이오류")}
else if(!spcheck){alert("특문오류")}
else if(!stcheck){alert("구문오류")}
else{alert("성공")}