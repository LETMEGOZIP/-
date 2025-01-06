import { CSSProperties } from "react"
import Album,{AlbumProps}from "./Album"
import Address, {AddressProps} from "./Address"
import GymName, {GymNameProps} from "./GymName"
import CategoryList, {CategoryListProps} from "./CategoryList"
import StarRate, {StarRateProps} from "./StarRate"
import Reviews, {ReviewsProps} from "./Reviews"
import Tag, {TagProps} from "./Tag"
import Price, {PriceProps} from "./Price"

export type CardUpperProps = AlbumProps & CategoryListProps  & GymNameProps & AddressProps & TagProps & PriceProps & ReviewsProps & StarRateProps

const CardUpper =(props:CardUpperProps) =>{
    const cardUpperStyle : CSSProperties = {
        display:"flex",
        gap: "10px",
        flexDirection:"row"
    }

    const rightStyle: CSSProperties={
        display:"flex",
        flexDirection:"column",
        justifyContent: "space-between",
        width : "90%"
    }

    const infoStyle : CSSProperties={
        display: "flex",
        flexDirection:"column",
    }

    const eventStyle : CSSProperties={
        display: "flex",
        flexDirection:"row",
        alignItems: "center",
        justifyContent:"space-between"
    }

    return (
    <div style={cardUpperStyle}>
        <Album image={props.image}/>
        <div style={rightStyle}>
            <div style={infoStyle}>
                <CategoryList categories={props.categories} />
                <GymName gymName={props.gymName} />
            
            <div>
            <StarRate starRate={props.starRate}></StarRate>
            <Reviews reviews={props.reviews}></Reviews>
            <Address address={props.address}></Address>
            </div>
            </div>
            <div style={eventStyle}>
                <Tag text = {props.text}></Tag>
                <Price price={props.price}></Price>
            </div>
            </div>
        </div>
        
    );
}

export default CardUpper