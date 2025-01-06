// arr 함수들
// map : 바꿔줘
// filter : 걸러줘, 어떤 조건에 부합하는 요소만 남겨줘

[10,20,30,40,50].filter((x)=>{
    return 30 > x;
});

[10,20,30,40,50,60].filter((x)=>{
    return x == 20 || x == 40;
});

// every : 어떠한 조건에 모든 요소가 부함하는가 (retrun boolean)
[10,20,30,40,50].every((x)=>{
    return x>10
}) // true

[10,20,30,40,50].every((x)=>{
    return x>60
}) //false

// 배열만들기

//Array(10) 열칸만들기

Array(100).fill(1).map((x)=>{
    return x + 1
}) // 100칸짜리 1 배열에 1씩 더하기


//[0,1,2,3,4,5,6,...99]
Array(20).fill(x.i).map((x)=>{
    return i 
}) // 99까지