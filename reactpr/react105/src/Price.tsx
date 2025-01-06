import { useState } from "react";

const Price = () =>{

    const [num, setNum] = useState(1)

    const goodsAdd = () =>{
        setNum((prev)=>{
            return (Number(prev)+1)
        })
    }

    const goodsSub = () =>{
        setNum((prev)=>{
            return prev == 1 ? prev : Number(prev)-1})
        }


    return(
    <div>
        <button onClick={goodsSub}>-</button>
        <span>{num}</span>
        <button onClick={goodsAdd}>+</button>
        <span>{num*15000}</span>
        </div>
        )
}


export default Price