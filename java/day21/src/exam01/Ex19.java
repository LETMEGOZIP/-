package exam01;

import java.io.File;

public class Ex19 {
    public static void main(String[] args) throws Exception{
        File dir = new File("D:/tmp"); //경로 있는지 체크, 없으면 생성
        if(!dir.exists()){
            //dir.mkdir(); // 디렉토리를 1개만 생성
            dir.mkdirs(); // 없는 상위 디렉토리도 생성
         }
        File file = new File("D:/tmp/test.txt");

        file.createNewFile();
    }
}
