function oddeven (x){
   return x % 2 ==1 ? "홀수" : "짝수"
}

function five (x){
    return x % 5 ==0 ? "5의 배수" : "5의 배수 아님"
}


//순수성에 위배됨, 팡숀 내부에 콘솔 쓰지 마쇼
function store (x){
if(x==1){
        console.log("팝콘")
    }
    else if(x==2){
        console.log("캬라멜팝콘")
    }
    else if(x==3){
        console.log("치즈 팝콘")
    }
    else{
        console.log("그없")
    }
}

function popcorn2(x){
    return `${x} 팝콘`;
}


function store2(x){
    const menu = { 1: "팝콘", 2:"캬라멜팝콘", 3:"치즈팝콘"};
    if (x==1 || x==2|| x==3){
        return menu[x]
    }
    else{
        return "그없"
    }
}

function store3(x){
    const menu = { 1: "팝콘", 2:"캬라멜팝콘", 3:"치즈팝콘"};
    return menu[x] || "그없"
}

function arraymaker (x, y, z){
    return [a,b,c]
}

function fruitice (x){
    return `${x}+"맛 아이스크림`;
}

function oddeven1(x){
    return x%2 == 1 ? true : false
}