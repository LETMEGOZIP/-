// DOM[HTML+CSS]

// element type

// const div = document.createElement("div")
// div.innerText="샤브샤브"
// div.style.color="red"
// document.body.appendChild(div)


// ["아메리카노", "에이드", "라떼"].forEach((v)=>{
//     const button = document.createElement("button");
//     button.innerText= v;
//     button.style.backgroundColor="skyblue";
//     button.style.color="white";
//     document.body.appendChild(button);
// })

// [{name:"아메리카노", bg:"yellow", color:"black"}, {name:"에이드", bg:"pink", color:"white"}, {name:"라떼", bg:"skybleu", color:"orange"}].forEach((x)=>{
//     const button = document.createElement("button");
//     button.innerText= x.name;
//     button.style.backgroundColor=x.bg
//     button.style.color=x.color;
//     document.body.appendChild(button);
// })

//사이트의 기획 먼저 파악 필요
//[html+css] +  [js]

const container = document.createElement("div")
// className classlist 둘 중에 아무거나 ㅇ
//container.className="container"

container.classList.add("container") // <div class="container"></div>

const box = document.createElement('div')
box.classList.add("box")
box.style.backgroundColor="red"
container.appendChild(box)

const box2 = document.createElement('div')
box2.classList.add("box")
box2.style.backgroundColor="yellow"
container.appendChild(box2)
document.body.appendChild(container)