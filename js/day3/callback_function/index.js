//함수 : 마술상자
// f(x) = X+1
//마라 크림 -> 마덖/크떡

//f(g(x)) : 마술상자 안에 마술상자 

const cook = (x)=>{
    console.log("요리시작")
    x();
    console.log("요리끝")
}

const maratang = ()=>{
    console.log("마라탕만들기")
}

const taco =()=>{
    console.log("타코 마들기")
}

const kimbab = ()=>{
    console.log("김밥만들기")
}

cook(maratang)
cook(taco)
cook(kimbab)

const skill= (magic)=>{
    console.log("스킬사용")
    magic();
    console.log("스킬완료")
}

const  fire = ()=>{
    console.log("불마법훠")
}