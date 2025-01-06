package exam03;

public interface Buyer {
    int NUM = 10; //public static final

    void buy();

    default void order(){
        System.out.println("buyer=주문");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("pricatemethod");
    }

    static void staticMethod(){ //어차피 public

    }
}
