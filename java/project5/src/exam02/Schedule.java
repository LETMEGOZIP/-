package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){ //setter 함수
        year = _year;
    }

    public int getYear(){ // getter 함수
        return year;
    }

    public void setMonth(int _month){
        month = _month;
    }

    public  int getMonth(){
        return month;
    }

    public void setDay(int _day){
        if(month==2&& _day > 28){ //통제가능
            _day = 28;
        }
        day = _day;
    }

    public int getDay(){
        return day;
    }


    void showDate(){
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
