package day7exeptionsAndThreads;

public class PrimeThreads {
    public static void main(String[] args) {
        PrimeThreads pt = new PrimeThreads(args);
    }

    public PrimeThreads(String[] args) {
        PrimeFinder[] finder = new PrimeFinder[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                long count = Long.parseLong(args[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("szukam liczby pierwszej " + count);
            } catch (NumberFormatException nfe) {
                System.out.println("Blad " + nfe.getMessage());
            }
        }

        boolean complete = false;

        while (!complete) {
            complete = true;
            for (int j = 0; j < finder.length; j++) {
                if (finder[j] == null) {
                    continue;
                }
                if (finder[j].finished) {
                    complete = false;
                } else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {

            }
        }
    }

    private void displayResult(PrimeFinder primeFinder) {
        System.out.println("Liczba pierwsza " + primeFinder.target + " to " + primeFinder.prime);
    }
}
