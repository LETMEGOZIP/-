package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Human human = new Human(); //Human, Object
        Bird bird = new Bird(); // Bird, Object
        Tiger tiger = new Tiger(); // Tiger, Object

        Object[] animals = new Object[3];
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;
    }
}
