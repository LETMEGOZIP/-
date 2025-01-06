import { useState } from "react";
import Fruit from "./Fruit";

type TestProps={
    price:number
}

const Test = () => {
    const [fruits, setFruits] = useState({apple:0 , banana:0, orange:0}) //구조체에 가격 추가해


const changeApple = () => {
    setFruits((prev)=>{
        return {... prev, apple:prev.apple + 1}
    })}

const changeBanana = () => {
setFruits((prev)=>{
    return {... prev, banana:prev.banana + 1}
})}

const changeOrange = () => {
    setFruits((prev)=>{
        return {... prev, orange:prev.orange + 1}
    })}

    return (
        <div>
            <Fruit
            click={changeApple}
            fruitName="사과"
            fruitAmount={fruits.apple}/>
            <Fruit
            click={changeBanana}
            fruitName="바나나"
            fruitAmount={fruits.apple}/><Fruit
            click={changeOrange}
            fruitName="사과"
            fruitAmount={fruits.apple}/>
        </div>
    )
}

export default Test