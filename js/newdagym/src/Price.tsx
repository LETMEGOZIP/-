import { CSSProperties } from "react";

export type PriceProps = {
    price:number;
}

const Price = (props:PriceProps) =>{
    const priceStyle : CSSProperties= {
        fontSize:"20px",
        fontWeight:"bold",
        color : "#3d4149"
    }
    
    return (
    <div style={priceStyle}>
        <span> {props.price}</span>
        <span>~/월</span>
    </div>)
}

export default  Price