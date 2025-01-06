package exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17 {
    public static void main(String[] args) throws Exception{
//        char ch = (char)System.in.read();
//        System.out.println(ch);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //스캐너써라
        char ch = (char)br.read();
        System.out.println(ch);
    }
}