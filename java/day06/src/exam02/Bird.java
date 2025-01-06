package exam02;

public class Bird extends Animal{
    public void move() {
        super.move(); //animal의 move 불러오기
        System.out.println("날개로 날름");
    }

    public void singing(){
        System.out.println("sing");
    }
}
