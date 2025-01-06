import { CSSProperties } from "react";

type ButtonCss = {color: string; padding: string}
type ButtonText = { text: string}

type ButtonProps ={
    color : string;
    padding : string;
    text : string
}

const Button = (props:ButtonProps) => {
    const buttonStyle:CSSProperties={
        color:props.color,
        padding: props.padding,
    };
    return <button style={buttonStyle}>{props.text}</button>;
};

export default Button;