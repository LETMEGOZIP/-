import { CSSProperties, useState } from "react"

type AblyProps ={
    name:string
    price:number
}
const Ably = (props:AblyProps) =>{
    

    const box:CSSProperties = {
        display: "flex",
        flexDirection:"row",
        justifyContent: "space-between",
        padding : "20px",
        border: "1px solid grey",
        width : "500px"
    }
    const [num, setNum] = useState(1)

    const goodsAdd = (props:AblyProps) =>{
        setNum((prev)=>{
            return (Number(prev)+1)
        })
    }

    const goodsSub = (props:AblyProps) =>{
        setNum((prev)=>{
            return prev == 1 ? prev : Number(prev)-1})
        }

    return (
        <div style={box}>
            <div>
                <button></button>
                <span></span>
                <button></button>
            </div>
            <div>
                <span></span>
            </div>
            <div>
                <span>{String(props.price*num)}</span>
            </div>
        </div>
    )
}



