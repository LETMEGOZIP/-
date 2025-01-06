//조건문!(조건에 맞으면 코드 실행)
//if-else문

const num = Number(prompt("숫자 입력"));

if(num>0){
    console.log("입력한 값은 양수임");
}
else if(num=0){
    console.log("이새끼0임")
}

else{
    console.log("입력한값은음수")
}

console.log("프로그램 끝")

// 수학 시험 점수 프로그램

const math = Number(prompt("수학 점수 입력"));
//90점 이상 a, 80점 b, 70점 c, 60점 d, 그 외 수강철회

if (math>=90){
    console.log("A");
}
else if (math >= 80){
    console.log("B");
}
else if (math>= 70){
    console.log("C");
}
else if (math>=60){
    console.log("D");
}
else{
    console.log("F\n넌나가라");
}

//숫자를 입력해서 양의 홀수, 양의 짝수, 0, 음의 홀수, 음의 짝수 알려주기

const integ = Number(prompt("정수 입력"));

if(integ>0){
    if(integ % 2 == 0){console.log("양의 짝수")}
    else{console.log("양의 홀수")};
}

else if (integ<0){
    if(integ % 2 == 0){console.log("음의 짝수")}
    else{console.log("음의 홀수")};
}

else{
    console.log("0이잔아...");
}

const isPositive = num1>0;
const isNegative=num1<0;
const isOdd=num1%2==1;
const isEven=num1%2==0;

if (isPositive && isOdd){
    console.log("양의 홀수");
}
//이런 식으로 조건 자체를 변수로 만들어서 쓰면 간지남