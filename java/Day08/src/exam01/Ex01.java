package exam01;

public class Ex01 {
    public static void main(String[] args) {
       try{
           int num1 = 0;
           int num2 = 10;
           int result = num2/num1;
           System.out.println(result);
           System.out.println("정상실행");
       }
       catch (ArithmeticException e) {
           e.printStackTrace();
           System.out.println("예외발생");
       }
       finally {
           System.out.println("무조건실행");
       }
    }
}
