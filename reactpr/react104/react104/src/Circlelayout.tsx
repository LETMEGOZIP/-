import { CSSProperties } from "react";
import Circle from "./circle";

type circlelayoutprops={
    repeatNumber : number;
}

const Circlelayout=(props:circlelayoutprops)=>{
    const gridStyle:CSSProperties={
        display:"grid",
        gridTemplateColumns:`repeate(${props.repeatNumber}, 1ft)`,
        gap:"30px"
    }
}
export default Circlelayout;