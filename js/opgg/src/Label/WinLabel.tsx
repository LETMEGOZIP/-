import { CSSProperties } from "react"

type WinLabelProps ={
    win : number
}

const WinLabel = (props:WinLabelProps) => {
    const winLabelStyle:CSSProperties={
        fontSize:"12px",
        color:"#57646F"
    }

    return <span style={winLabelStyle}>{props.win}%</span>
}

export default WinLabel

