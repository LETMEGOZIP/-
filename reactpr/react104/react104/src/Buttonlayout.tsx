import { CSSProperties, ReactNode } from "react";
import Button from "./button";

type buttonlayoutprops={
    columnNumber : number;
    components: ReactNode;
}

const Buttonlayout=(props:buttonlayoutprops)=>{
    const gridStyle:CSSProperties={
        display:"grid",
        gridTemplateColumns:`repeat(${props.columnNumber}, 1fr)`,
        gap : "30px"
    }
    return <section style={gridStyle}>{props.components}</section>
}
export default Buttonlayout;