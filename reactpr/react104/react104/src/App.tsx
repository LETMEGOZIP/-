import Button from "./button";
import Circle from "./circle";
import Circlelayout from "./Circlelayout";
import Buttonlayout from "./Buttonlayout";

function App() {
  return (
    <div>
      <Buttonlayout
        columnNumber={3}
        components={
          <>
            <Button backgroundColor="Primary" borderRadius="Hard" text="Button" />
            <Button backgroundColor="Primary" borderRadius="Smooth" text="Button" />
            <Button backgroundColor="Primary" borderRadius="Circle" text="Button" />
            <Button backgroundColor="Hover" borderRadius="Hard" text="Button" />
            <Button backgroundColor="Hover" borderRadius="Smooth" text="Button" />
            <Button backgroundColor="Hover" borderRadius="Circle" text="Button" />
            <Button backgroundColor="Deactive" borderRadius="Hard" text="Button" />
            <Button backgroundColor="Deactive" borderRadius="Smooth" text="Button" />
            <Button backgroundColor="Deactive" borderRadius="Circle" text="Button" />
          </>
        }
      />
    </div>
  );
}

export default App;