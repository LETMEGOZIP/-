import { CSSProperties } from "react"
import Album from "./Album"
import Address from "./Address"
import GymName from "./GymName"
import CategoryList from "./CategoryList"
import StarRate from "./StarRate"
import CardUpper, { CardUpperProps } from "./CardUpper"
import FreeContents from "./FreeContents"
import CardDown from "./CardDown"

type CardProps = CardUpperProps


const Card = (props:CardProps)=>{
    const cardStyle:CSSProperties ={
        padding : "10px",
        display : "flex",
        flexDirection : "column",
        gap : "10px"
    }

    return(
    <article style={cardStyle}>
        <CardUpper {...props}/>
        <CardDown/>
    </article>)
}

export default Card