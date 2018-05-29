package day5ClassesAndMethods;

public class Ex1 {
    String status;
    int speed;
    float temperature;

    public Ex1() {
    }

    public Ex1(String status, int speed, float temperature) {
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }

    void checkTemperature(){
        if (temperature < -62){
            status = "return home";
            speed = 5;
        }
    }

    void showAttributes () {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature " + temperature);
    }
}
