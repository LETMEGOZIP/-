import { useState } from "react";

type CafeProps={
    price:number
}

const Cafe = () => {
    const [coffee, setcoffee] = useState({AA:0 , latte:0, cchino:0}) //구조체에 가격 추가해


const changeAA = () => {
    setcoffee((prev)=>{
        return {... prev, AA:prev.AA + 1}
    })}

const changelatte = () => {
setcoffee((prev)=>{
    return {... prev, latte:prev.latte + 1}
})}

const changecchino = () => {
    setcoffee((prev)=>{
        return {... prev, cchino:prev.cchino + 1}
    })}

    return 
        <div>
            <span onClick={changeAA}>아아:{coffee.AA}, {coffee.AA *2000} </span>
            <span onClick={changelatte}>라떼:{coffee.latte}, {coffee.latte *1500}  </span>
            <span onClick={changecchino}>치노:{coffee.cchino} {coffee.cchino *1000} </span>
            <span>총갯수:{coffee.AA+coffee.latte+coffee.cchino} </span>
            <span>총가격:{coffee.AA*2000+coffee.latte*1500+coffee.cchino*1000}</span>
        </div>
    
}

export default Cafe