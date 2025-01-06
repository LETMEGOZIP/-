// state[상태]: 변경되는 애들을 state로 넣어라
// react19 - state


import { useState } from "react";

const Button = () => {

    const [food, setFood] = useState("마라탕")

    const abc = () =>{
        setFood((prev)=>{
            return prev + "후루 사줘 돈 많아 오빠"
        })
    }


    const [num, setNum]= useState(0)

    const Up = () => {
        setNum((prev)=>{
            return Number(prev)+1
    })}

    return <button onClick={Up}>{num}</button>
}

export default Button;