import { CSSProperties } from "react"

type TierProps ={
    tier : 1|2|3|4|5
}

const Tier = (props:TierProps)=>{
    const tiermap = [
        "https://s-lol-web.op.gg/images/icon/icon-tier-1.svg?v=1724034092925",
        "https://s-lol-web.op.gg/images/icon/icon-tier-2.svg?v=1724034092925",
        "https://s-lol-web.op.gg/images/icon/icon-tier-3.svg?v=1724034092925",
        "https://s-lol-web.op.gg/images/icon/icon-tier-4.svg?v=1724034092925",
        "https://s-lol-web.op.gg/images/icon/icon-tier-5.svg?v=1724034092925"]
        // any?


    const tierStyle:CSSProperties = {
        width: "24px",
        height: "24px"
    }
    return <img src={tiermap[props.tier-1]} alt="" />
}

export default Tier