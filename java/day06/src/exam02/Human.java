package exam02;

public class Human extends Animal{
    @Override

    public void move() {
        super.move(); //animal의 move 불러오기
        System.out.println("두발로 직립보행");
    }

    public void reading(){
        System.out.println("ㅇ릭어!");
    }
}
