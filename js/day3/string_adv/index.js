//string_adv
const pizza = "cheese pizza"

//포함하니?
const hasCheese = pizza.includes("cheese"); // true
const hasPine = picca.includes("pinaeapples"); // false
const hasC = pizza.includes("c"); // true
const hasee = pizza. includes("ee"); // true


//몇번째임
const indexH = pizza.indexOf("h"); //1
const indexB = pizza.indexOf("b") // -1

pizza.startsWith("pizza"); //false
pizza.endsWith("pizza"); //true

pizza.replace("z", "k"); // cheese pikza
pizza.replaceAll("z", "k"); // cheese pikka

//나누기
pizza.slice(0,4) // cheese

//나누기 배열화
pizza.split(i); // ["cheese p". "zza"]
pizza.split(" "); ["cheese", "pizza"]

//반복하게
pizza.repeat(3); //치즈피자세번

pizza.length; //문자의 길이