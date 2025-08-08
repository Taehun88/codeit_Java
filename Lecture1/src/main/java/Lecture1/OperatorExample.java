package Lecture1;

public class OperatorExample {
    public static void main(String[] args) {
        double temperature = 33;
        String gender = "남성";
        if(temperature > 40){
            System.out.println("폭염입니다.");
            if(gender == "남성"){
                System.out.println("남성은 더위를 잘 견딥니다.");
            } else {
                System.out.println("여성은 더위를 잘 견딥니다.");
            }
        } else if(temperature > 20){
            System.out.println("더운 날씨입니다.");
            if(gender == "남성"){
                System.out.println("남성은 더위를 잘 견딥니다.");
            } else {
                System.out.println("여성은 더위를 잘 견딥니다.");
            }
        } else if(temperature > 10){
            System.out.println("온화한 날씨입니다.");
            if(gender == "남성"){
                System.out.println("남성은 온화한 날씨를 좋아합니다.");
            } else {
                System.out.println("여성은 온화한 날씨를 좋아합니다.");
            }
        } else {
            System.out.println("추운 날씨입니다.");
            if(gender == "남성"){
                System.out.println("남성은 추위를 잘 견딥니다.");
            } else {
                System.out.println("여성은 추위를 잘 견딥니다.");
            }
        }

        switch (gender){
            case "남성":
                System.out.println("남성입니다.");
                break;
            case "여성":
                System.out.println("여성입니다.");
                break;
            default:
                System.out.println("알 수 없는 성별입니다.");
                break;
        }
    }
}
