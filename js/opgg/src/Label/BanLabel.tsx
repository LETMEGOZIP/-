import { CSSProperties } from "react"

type BanLabelProps ={
    ban : number
}

const BanLabel = (props:BanLabelProps) => {
    const banLabelStyle:CSSProperties={
        fontSize:"12px",
        color:"#57646F"
    }

    return <span style={banLabelStyle}>{props.ban}%</span>
}

export default BanLabel