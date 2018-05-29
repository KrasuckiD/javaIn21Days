package day6PackagesAndInterfaces;

public class InstacneCounter {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstacneCounter() {
        InstacneCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("rozpoczynanie z " + InstacneCounter.getCount() + " obiektow");
        for (int i = 0; i < 500; i++) {
            new InstacneCounter();
        }
        System.out.println("utworzono " + InstacneCounter.getCount() + " obiektor");
    }
}
