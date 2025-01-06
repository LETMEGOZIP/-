import Card from "../Card/Card"
import data from "../data"

const CardLayout = () => {
    return <main style={{width:"100vw"}}><section style={{display:"flex",
        flexDirection:"column", 
        borderBottom:"1px solid #9aa4af"
    }}
    >
        {ChampionRankingList.map((v,i)=>{
            <Card>
                rank
                elevation
                championImage
                tier
                position
                winPercent
                pickPercent
                banPercent
                ChampionRoundIamges
            </Card>
        })}
        </section>
        </main>
}

export default CardLayout