import { CSSProperties } from "react"

type ElevationProps={
    elevation : number
}

const Elevation = (props:ElevationProps) => {
    const elevationStyle:CSSProperties = {
        fontSize: "12px"
    }
    return<span style={elevationStyle}>{props.elevation}</span>
}

export default Elevation