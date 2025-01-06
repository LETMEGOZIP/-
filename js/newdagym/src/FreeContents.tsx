import { CSSProperties } from "react"

export type freeContentsProps = {
    services: string
}

const FreeContents = (props:freeContentsProps) => {
    const freeStyle : CSSProperties ={
        backgroundColor : "#f1f3f6",
        padding : "8px, 12px",
        borderRadius:"10px",
        display:"flex",
        flexDirection:"row",
        alignItems : "center",
        gap : "15px"
    }

    const serviceStyle:CSSProperties={
        fontSize:"12px",
        fontWeight:"bold",
        color: "#999FA9"
    }

    return <div style={freeStyle}>
        <span style={serviceStyle}>{props.services}</span>
    </div>
}

export default FreeContents