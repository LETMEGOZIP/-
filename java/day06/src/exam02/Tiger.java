package exam02;

public class Tiger extends Animal {
    public void move() {
        super.move(); //animal의 move 불러오기
        System.out.println("네발로 뛰댕김");
    }
    public void roaring(){
        System.out.println("raor");
    }
}
