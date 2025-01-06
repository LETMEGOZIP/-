type FruitProps={
    fruitName:string
    fruitAmount: number
    click: () => void
}


const Fruit = (props:FruitProps) => {

    return <span onClick={props.click}>
        {props.fruitName} : {props.fruitAmount}
        </span>
}

export default Fruit