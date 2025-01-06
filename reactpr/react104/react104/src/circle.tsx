import { CSSProperties } from "react";

type CircleProps ={
    backgroundColor: string;
}

const circle = (props:CircleProps)=>{
    const CircleStyle:CSSProperties={
        width:"50px",
        height:"50px",
        borderRadius:"100px",
        border: "none",
        backgroundColor:props.backgroundColor
    }
    return <div style={CircleStyle}></div>;
}

export default circle;