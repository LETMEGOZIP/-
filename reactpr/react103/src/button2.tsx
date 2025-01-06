import { CSSProperties } from "react";

type Button2Css = {color: string; padding: string}
type Button2Text = { text: string}

type Button2props ={
    shape:"Hard" | "Smooth" | "Circle"
    active : "Primary" | "Hover" | "Deactive"
    text : string
}


const Button2 = (props:Button2props) => {
    const shapemap = {
        Hard:"0px",
        Smooth:"5px",
        Circle:"50px"
    }

    const activemap = {
        Primary:"#205BF3",
        Hover:"#478DF5",
        Deactive:"#979797"
    }

    const Button2Style:CSSProperties={
        fontSize:"32px",
        color:"white",
        padding:"10px 5px 10px 5px",
        border:"none",
        backgroundColor:activemap[props.active],
        borderRadius:shapemap[props.shape]
    };
    return <button style={Button2Style}>{props.text}</button>;
};

export default Button2;