package day1ClassAndOject;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploration";
        spirit.speed = 2;
        spirit.temperature = -60;

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "exploration";
        opportunity.speed = 3;
        opportunity.temperature = -60;

        spirit.showAttributes();
        System.out.println();
        System.out.println("Speed increase 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println();
        System.out.println("Temperature increase -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println();
        System.out.println("Check temperature");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
