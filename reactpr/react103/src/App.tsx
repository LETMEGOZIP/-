import Button from "./button";
import Button2 from "./button2"
import GridLayout from "./GridLayout";
import GridLayoutcircle from "./GridLayoutcircle";
import Circle from "./circle";
import Box from "./box";

function App(){
  return<div>
    {/* <Button padding="10px 20px" color = "pink" text="아침"></Button>
    <Button padding="10px 20px" color = "pink" text="점심"></Button>
    <Button padding="10px 20px" color = "pink" text="저녁"></Button> */}
    {/* Box
        배경색: 핑그 오랜지 하늘색 빨강
        사이즈 : 스멀 미듐 라지 -> 5050 100100 200200
    */}
    {/* <Box size="small" backgroundcolor="pink"></Box>
    <Box size="medium" backgroundcolor="skyblue"></Box>
    <Box size="large" backgroundcolor="orange"></Box>

    <GridLayout repeatNumber={3}/> */}
    <GridLayoutcircle/>

  </div>
}
export default App