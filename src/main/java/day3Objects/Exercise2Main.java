package day3Objects;

public class Exercise2Main {
    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();
        exercise.setHeight(2);
        exercise.setWeight(3);
        exercise.setDepth(4);
        System.out.println(exercise.getDepth()+" "+exercise.getHeight()+" "+exercise.getWeight());
    }
}
