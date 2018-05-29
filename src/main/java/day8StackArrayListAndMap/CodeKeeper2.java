package day8StackArrayListAndMap;

import java.util.ArrayList;

public class CodeKeeper2 {
    ArrayList<String> list;

    String[] codes = {"alfa", "lambda", "gamma", "delta", "zeta"};

    public CodeKeeper2(String[] userCodes) {
        list = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);
        }

        for (int j = 0; j < userCodes.length; j++) {
            addCode(userCodes[j]);
        }
    }

    private void addCode(String code) {
        if (!list.contains(code)) {
            list.add(code);
        }
    }

    public static void main(String[] args) {
        CodeKeeper2 keeper2 = new CodeKeeper2(args);
    }
}
