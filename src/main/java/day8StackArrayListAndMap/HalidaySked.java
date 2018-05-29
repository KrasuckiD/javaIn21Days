package day8StackArrayListAndMap;

import java.util.BitSet;

public class HalidaySked {
    BitSet sked;

    public HalidaySked() {
        sked = new BitSet(365);
        int[] holiday = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
        for (int i = 0; i < holiday.length; i++) {
            addHoliday(holiday[i]);
        }
    }

    private void addHoliday(int dayToAdd) {
        sked.set(dayToAdd);
    }

    public boolean isHoliday(int dayToCheck) {
        boolean result = sked.get(dayToCheck);
        return result;
    }

    public static void main(String[] args) {
        HalidaySked cal = new HalidaySked();
        if (args.length > 0) {
            try {
                int witchDay = Integer.parseInt(args[0]);
                if (cal.isHoliday(witchDay)) {
                    System.out.println("Dzien numer " + witchDay + " to swieto");
                } else {
                    System.out.println("Dien numer " + witchDay + " nie jest swietem");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Blad: " + nfe.getMessage());
            }
        }
    }
}
