import { CSSProperties } from "react"

export type StarRateProps={
    starRate:number;
}

const StarRate = (props:StarRateProps) => {
    const starRateStyle:CSSProperties={
        color: "#FFC500",
        fontSize:"12px",
        fontWeight: "bold"
    }

    return <span style={starRateStyle}>{props.starRate}</span>
}

export default StarRate