const colors = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"]


const container = document.createElement("div")

Array(2000).fill(0).forEach((v,i)=>{
    const box = document.createElement("div");
    box.classList.add("box")
    box.style.backgroundColor= colors[i%colors.length]
    container.appendChild(box);
})
document.body.appendChild(container)