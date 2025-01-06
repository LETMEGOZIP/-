import { CSSProperties, useState } from "react"

type MusinProps ={
    name:string
    price:number
}

const Musin = (props:MusinProps) =>{
    

    const card:CSSProperties = {
        display: "flex",
        flexDirection:"row",
        justifyContent: "space-between",
        padding : "20px",
        border: "1px solid grey",
        width : "500px"
    }

    const box:CSSProperties = {
        display: "flex",
        flexDirection:"column",
        justifyContent: "space-between",
        padding : "20px",
        border: "1px solid grey",
        height:"600 px"
    }
    const [num, setNum] = useState(1)
    const [num2, setNum2] = useState(1)

    const goodsAdd = () =>{
        setNum((prev)=>{
            return (Number(prev)+1)
        })
    }

    const goodsSub = () =>{
        setNum((prev)=>{
            return prev == 1 ? prev : Number(prev)-1})
        }

    return (<div style={box}>
        <div style={card}>
        <div>
                <button onClick={goodsSub}>-</button>
                <span>{num}</span>
                <button onClick={goodsAdd}>+</button>
            </div>
            <div>
                <span></span>
            </div>
            <div>
                <span>{String(props.price*num)}</span>
            </div>
        </div>

        <div style={card}>
            <div>
                <button onClick={goodsSub}>-</button>
                <span></span>
                <button onClick={goodsAdd}>+</button>
            </div>
            <div>
                <span>{num2}</span>
            </div>
            <div>
                <span>{String(props.price*num2)}</span>
            </div>
        </div>
        </div>
    )
}

export default Musin