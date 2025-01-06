function hello(x){
    return ` hello ${x}님!`
}

function ping(x){
    return `${x}핑!`;
}

function lucky(x){
    return `${x}이라니 완전 러키비키잔아`;
}

function square(x, y){
    return x**y;
}

function date(x, y, z){
    return `${x}년도, ${y}월, ${z}일`;
}

function mbti(m,b,t,i){
    if(m == 'e'){ei=`외향적`}
    else if(m =='i'){ei=`내향적`}
    if(b == 'd'){sn=`감각적`}
    else if(b =='n'){sn=`직관적`}
    if(t == 't'){tf=`이성적`}
    else if(t == 'f'){tf=`감성적`}
    if(i == 'j'){jp=`계획적`}
    else if(i == 'p'){jp=`충동적`}

    return `${ei} / ${sn} / ${tf} / ${jp}`;
}

function mbti2(m,b,t,i){
    const mbtimap = {
        e:"외향적",
        i:"내향적",
        s:"감각적",
        n: "직관적",
        t: "이성적",
        f: "감성적",
        j: "계획적",
        p: "즉흥적"
    }
    return `${mbtimap[m]}, ${mbtimap[b]}, ${mbtimap[t]}, ${mbtimap[i]}`;
}

function zodiac(x){
    if( x % 12 == 0 ){`신`}
    else if( x % 12 == 1 ){return `유`}
    else if( x % 12 == 2 ){return `술`}
    else if( x % 12 == 3 ){return `해`}
    else if( x % 12 == 4 ){return `자`}
    else if( x % 12 == 5 ){return `축`}
    else if( x % 12 == 6 ){return `인`}
    else if( x % 12 == 7 ){return `묘`}
    else if( x % 12 == 8 ){return `진`}
    else if( x % 12 == 9 ){return `사`}
    else if( x % 12 == 10 ){return `오`}
    else if( x % 12 == 11 ){return ``}
    else{return `어디역법이에요 그게`}
}

function zodiac2(x){
    const target = year % 12;
    const animal={
    0:"신",
    1:"유",
    2:"술",
    3:"해",
    4:"자",
    5:"축",
    6:"인",
    7:"묘",
    8:"진",
    9:"사",
    10:"오",
    11:"미",}

    return `${animal[target]}띠`
}