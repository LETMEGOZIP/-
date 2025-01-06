import { CSSProperties } from "react"
import Champion, {ChampionProps} from "../Champion/Champion"
import Elevation, {ElevationProps} from "../Elevation/Elevation"
import BanLabel, {BanLabelProps} from "../Label/BanLabel"
import PickLabel, {PickLabelProps} from "../Label/PickLabel"
import WinLabel, {WinLabelProps} from "../Label/WinLabel"
import Position, {PositionProps} from "../Position/Position"
import Tier, {TierProps} from "../Tier/Tier"

export type CardProps = ChampionProps & ElevationProps & BanLabelProps & PickLabelProps & WinLabelProps &

const Card = (props : CardProps) => {
    const cardStyle :CSSProperties={
        display: "flex",
        flexDirection:"row"
    }

    return <div style={cardStyle}>
        
        <Champion champion={props.champion}></Champion>
    </div>
}

export default Card