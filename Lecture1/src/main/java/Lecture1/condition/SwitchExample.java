package Lecture1.condition;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("월요일입니다.");
                break;
            case 2:
                System.out.println("화요일입니다.");
                break;
            case 3:
                System.out.println("수요일입니다.");
                break;
            default:
                System.out.println("기타 요일입니다.");
                break;
        }
    }
}
