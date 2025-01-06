import { CSSProperties } from "react"


type PositionProps ={
    position : string
}

// const Position = (props:PositionProps) => {
//     const positionmap = {
//         "TOP" : "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-top.svg?v=1724034092925",
//          "MID" : "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-mid.svg?v=1724034092925",
//          "SUPPORT": "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-sup.svg?v=1724034092925",
//          "ADC" : "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-bot.svg?v=1724034092925",
//          "JUNGLE" : "https://s-lol-web.op.gg/assets/images/positions/01-icon-01-lol-icon-position-top.svg?v=1724034092925"
//     }

//     const positionStyle:CSSProperties={
//         fontSize:"12px",
//         color:"#57646F"
//     }
//     const imageurl = positionmap[props.position] || "";
//     return <img src="" alt="" />
// }

const Position = (props:PositionProps) => {

    const positionStyle:CSSProperties={
        fontSize:"12px",
        color:"#57646F"
    }
    
    return <span>{props.position}</span>
}

export default Position;