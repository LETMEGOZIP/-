import { CSSProperties } from "react"
import Circle from "./circle"


const GridLayoutcircle = ()=>{
    const gridStyle:CSSProperties={
        display:"grid",
        gridTemplateColumns:`repeat(5,1fr)`,
        gap:"30px"
    }

    return (
        <section style={gridStyle}>
            {["red","blue","green","pink","grey","skyblue","indigo","purple","orange"].map((v)=>(
                <Circle backgroundColor={v} />
            ))}
        </section>
    )
}

export default GridLayoutcircle