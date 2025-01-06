import { useState } from "react"

const Counter = () =>{

    const [num, setNum] = useState(0)

    const counterAdd = () =>{
        setNum((prev)=>{
            return (Number(prev)+1)
        })
    }

    const counterSub = () =>{
        setNum((prev)=>{
            return prev == 0 ? prev : Number(prev)-1})
        }


    return(
    <div>
        <button onClick={counterSub}>-</button>
        <span style={{backgroundColor: num >= 10 ? "red" : "white"}}>
            {num}
            </span>
        <button onClick={counterAdd}>+</button>
        </div>
        )
}


export default Counter