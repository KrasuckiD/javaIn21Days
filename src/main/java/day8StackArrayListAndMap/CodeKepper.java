package day8StackArrayListAndMap;

import java.util.ArrayList;
import java.util.Iterator;

public class CodeKepper {
    ArrayList list;
    String[] codes = {"alfa", "lambda", "gamma", "delta", "zeta"};

    public CodeKepper(String[] userdCodes) {
        list = new ArrayList();
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);
        }
        for (int j = 0; j < userdCodes.length; j++) {
            addCode(userdCodes[j]);
        }
        for (Iterator ite = list.iterator(); ite.hasNext(); ) {
            String output = (String) ite.next();
            System.out.println(output);
        }
    }

    private void addCode(String code) {
        if (!list.contains(code)) {
            list.add(code);
        }
    }

    public static void main(String[] args) {
        CodeKepper codeKepper = new CodeKepper(args);
    }
}
