import { CSSProperties } from "react"

type PickLabelProps ={
pick : number
}

const PickLabel = (props:PickLabelProps) => {
    const pickLabelStyle:CSSProperties={
        fontSize:"12px",
        color:"#57646F"
    }

    return <span style={pickLabelStyle}>{props.pick}%</span>
}

export default PickLabel