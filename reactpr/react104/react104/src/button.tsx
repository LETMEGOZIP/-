import { CSSProperties } from "react";

type Buttonprops ={
    borderRadius:"Hard" | "Smooth" | "Circle"
    backgroundColor : "Primary" | "Hover" | "Deactive"
    text : string
}

const Button = (props:Buttonprops)=>{
    const borderRadius = {
        Hard:"0px",
        Smooth:"5px",
        Circle:"50px"
    }

    const backgroundColor = {
        Primary:"#205BF3",
        Hover:"#478DF5",
        Deactive:"#979797"
    }

    const ButtonStyle:CSSProperties={
        fontSize :"32px",
        color:"white",
        border:"none",
        backgroundColor:backgroundColor[props.backgroundColor],
        borderRadius:borderRadius[props.borderRadius]
    }
    return <button style={ButtonStyle}>{props.text}</button>
}

export default Button;