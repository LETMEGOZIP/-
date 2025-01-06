import { CSSProperties } from "react";

export type GymNameProps = {
    gymName:string;
}

const GymName=(props:GymNameProps)=>{
    const gymNameStyle : CSSProperties={
        fontWeight:"bold",
        lineHeight:"26px"
    }
    return <span style={gymNameStyle}>{props.gymName}</span>
}

export default GymName