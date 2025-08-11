package OOPLecture.Example06;

public class AirConditioner {
    private final String brand;
    private int temperature;
    private String mode;
    private String windDirection;
    private final int energyConsumption;
    private boolean isOn;

    public AirConditioner(String brand, int temperature, String mode, int energyConsumption) {
        this.brand = brand;
        this.temperature = temperature;
        this.mode = mode;
        this.windDirection = "stop";
        this.energyConsumption = energyConsumption;
        this.isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getMode() {
        return mode;

    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
        System.out.println("바람 방향을 " + windDirection + "(으)로 변경했습니다.");

    }

    public void changeStatus(){
        if (isOn) {
            System.out.println("에어컨을 끕니다.");
        } else {
            System.out.println("에어컨을 켭니다.");
        }
        isOn = !isOn;
    }

    public void downTemperature() {
        if (isOn) {
            temperature--;
            System.out.println("온도를 1도 낮췄습니다. 현재 온도: " + temperature + "도");
        } else {
            System.out.println("에어컨이 꺼져 있습니다. 먼저 켜주세요.");
        }
    }

    public void upTemperature() {
        if (isOn) {
            temperature++;
            System.out.println("온도를 1도 올렸습니다. 현재 온도: " + temperature + "도");
        } else {
            System.out.println("에어컨이 꺼져 있습니다. 먼저 켜주세요.");
        }
    }

    public void changeMode(String mode){
        if (isOn) {
            this.mode = mode;
            if(mode.equals("난방")){
                temperature = temperature + 5;
            }
            if(mode.equals("냉방")){
                temperature = temperature - 5;
            }
            System.out.println("모드를 " + mode + "(으)로 변경했습니다.");
        } else {
            System.out.println("에어컨이 꺼져 있습니다. 먼저 켜주세요.");
        }
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "brand='" + brand + '\'' +
                ", temperature=" + temperature +
                ", mode='" + mode + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", isOn=" + isOn +
                '}';
    }
}
