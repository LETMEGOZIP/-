package exam02;

public class ex01 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(); //다형성으로 인해 tiger에 Tiger말고 Animal로도 설정 가능
        tiger.move();

        Bird bird = new Bird(); // 얘도 Animal로 가능
        bird.move();

        Human human = new Human();
        human.move();
    }
}
