import { CSSProperties } from "react"
import Button2 from "./button2"
type GridLayoutProps={
    repeatNumber : number;
}
const shapes = ["Hard" , "Smooth" , "Circle"]
const actives = ["Primary" , "Hover" , "Deactive"]


const GridLayout = (props: GridLayoutProps)=>{
    const gridStyle:CSSProperties={
        display:"grid",
        gridTemplateColumns:`repeat(${props.repeatNumber},1fr)`,
        gap:"30px"
    }
//     return(
//         <section style={gridStyle}>
//             {actives.map((v)=>{
//                 shapes.map((v)=>{})
//             })}
//         </section>
// )
}

export default GridLayout