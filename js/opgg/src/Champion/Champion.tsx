import { CSSProperties } from "react"

type ChampionProps = {
    champion : string
}

const Champion = (props:ChampionProps) => {
    const championStyle:CSSProperties={
        fontSize: "12px",
        fontWeight: "bold",
        color: "#202D37"
    }
    return <span style={championStyle}>{props.champion}</span>
}

export default Champion