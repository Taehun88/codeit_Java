package Lecture1.While;

public class BreakExample {
    public static void main(String[] args) {
        double temperature = 36.5;
        while(temperature < 60){
            System.out.println("Current temperature: " + temperature);
            if(temperature > 40){
                System.out.println("temperature is greater than 40: " + temperature);
                break;
            }
            temperature++;
        }
    }
}
