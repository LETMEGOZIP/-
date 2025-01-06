import { CSSProperties } from "react";

export type TagProps = {
    text:string;
}

const Tag = (props:TagProps) => {
    const tagStyle:CSSProperties={
        padding :"3px, 6px",
        fontSize:"12px",
        borderRadius:"4px",
        fontWeight:"bold",
        backgroundColor:"#eaeeff",
        color:"#5467f5",
        border:"1px solid #eaeeff"
    }
    return <span style={tagStyle}>{props.text}</span>
}

export default Tag