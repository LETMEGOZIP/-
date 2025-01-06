package exam02;

//@MyAnno(value = "여기는클래스")
@MyAnno(value = {"여기는클래스", "여기는메서드클라스"}, min=10, max=20)
public class Student {

    @MyAnno(value = {"여기는메서드", "여기는메서드클라스"}, min=1, max=10)
    public void study(){

    }
}
