package DAY1020;

public class trance {
    static int trance(String x) { // gameProgram2 실행시 입력받은 user값을 정수로 변환

        return switch (x) {
            case "가위" -> 0;
            case "바위" -> 1;
            case "보" -> 2;
            case "설명" -> 3;
            case "종료" -> 4;
            default -> 99999;
        };
    }
}
//한글로 인한 문제!