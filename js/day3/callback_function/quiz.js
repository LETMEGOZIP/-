
const americano = ()=>{
    console.log("에스프레소 쏴아악")
    console.log("물때려박기")
}

const latte = () => {
    console.log("에스?프레?소")
    console.log("우유 부아악")
}

const vanilla = () => {
    console.log("에스프?레?소")
    console.log("우유바날라부아악")
}

const makecof = (coffee)=>{
    console.log("커피준비");
    coffee()
    console.log("커피 완료");
}

makecof(americano);

makecof(()=>{
    console.log("에스프레소에 망고 넣기")
})