import { CSSProperties } from "react"

export type AddressProps = {
    address:string
}

const Address = (props:AddressProps)=>{
    const addressStyle: CSSProperties={
        color: "#999fa9",
        fontSize: "12px",
        lineHeight:"20px"
    }
    return <span style={addressStyle}>{props.address}</span>
}

export default Address