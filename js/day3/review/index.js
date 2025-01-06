//프로그램이 언어 : 컴퓨터에게 명령어를 넣는 언어

//자바스크립트 : 브라우저(DOM[html+css])를 조작하기 위한 언어

// alert, prompt, console.log[Input/Output]

// Variable(변수) : const, let(거의안씀, 재할당 가능), var(<-이거쓰지마)

const kim =  "kim";

let a = "김밥"
a = "치즈김밥"

const b = "불고기"
//b = "불고기김밥" <- 재할당불가 문법오류

//Data-Type(타입):
// * 기본: String['', "", ``], Number[숫자], Boolean[truefalse], Null, Undefined
// * 참조: Array["손흥민", "김민재"], Object {Key[문자,정수]:Value[암거나]}

//Type-Casting(타입변환)
// * 문자화:String(), +[문자열연결연산자]
// * 숫자화: Numer(), parseInt() 
// * 불리언화: Boolean(), !"탕후루" -> Truthy & Falsy(0, "", null, undefined, [])


// Operator(연산자)
// * 산술연산자 : +,-,*,/,%,**
// * 논리연산자 : &&(and), ||(or), !(not)
// * 대입연산자 : =
// * 비교연산자 : ==, !=, >, < , >=, <=
// * 삼항연산자 : 조건식 ? 참 : 거짓

// Condition(조건문) if(조건식), else, - if (조건식), else

// Function(함수)[마술상자]
// Function name(){}