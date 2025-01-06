package org.koreait.exam01;

//변경 불가능한 라이브러리 클래스라 가정하고 만드는 중
// InitializingBean, DisposableBean을 정의하는 못하는 상황이라고 가정
public class Message2 {

    public void init(){
        System.out.println("init 호출");
    }

    public void close(){
        System.out.println("close 호출");
    }


    public void send(String message){
        System.out.printf("메세지:%s, 전송완료!%n, message", message);
    }
}
