package OOPLecture.Example06;

public class UseAirConditioner {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("LG", 24, "냉방", 1);
        ac.changeStatus();
        ac.setTemperature(22);
        ac.setWindDirection("좌우");
        ac.changeMode("난방");
        System.out.println(ac);

        ac.changeStatus();
        ac.downTemperature();
        ac.upTemperature();
        ac.changeMode("송풍");

        System.out.println(ac);

        ac.changeStatus();
        ac.upTemperature();
        ac.downTemperature();
        System.out.println(ac);

        ac.changeMode("제습");
        System.out.println(ac.getMode() + "," + ac.getTemperature());

        ac.changeMode("난방");
        System.out.println(ac.getMode()+ "," + ac.getTemperature());

        ac.changeMode("송풍");
        System.out.println(ac.getMode() + "," + ac.getTemperature());

        ac.changeMode("제습");
        System.out.println(ac.getMode() + "," + ac.getTemperature());


    }
}
