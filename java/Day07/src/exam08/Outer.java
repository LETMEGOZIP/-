package exam08;
import exam02.Calculator;

public class Outer {
    Calculator method(){
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                //num3 = 20; // final num3; 지역 변수의 상수화, 제거되지않고 유지 위함
                return num1+num2;
            }
        };

        Calculator method(int num3){
            return new Calculator() {
                @Override
                public int add(int num1, int num2) {
                    return num1+num2+num3;
                }
            };
        }

        return cal;

//        int result = cal.add(10,20);
//        System.out.println(result);
    }
}
