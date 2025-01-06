package exam01;

public enum Transfortation { //여기 있는건 모두 transportation의 정적 상수 개체?
    Subway("버스"){ //생성자로 전달
        @Override
        public int getTotal(int person) {
            return 1500*person;
        }
    },

    Bus("버스"){
        @Override
        public int getTotal(int person) {
            return 1400*person;
        }
    },

    Taxi("택시"){
        @Override
        public int getTotal(int person) {
            return 4000*person;
        }
    };

    private final String title;

    Transfortation(String title){ // 기본 private
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public abstract int getTotal (int person); // enum 클래스는 추상 메서드 생성 가능한 추상 클래스
}
