package homeWorkAgain;

import java.util.Arrays;
import java.util.Scanner;

public class Brackets {


    static int count1 = 0;
    static int count2 = 0;

    public void examBrackets() {

        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите математическое выражение: ");
        String str = in.next();
        char[] ch = str.toCharArray();
        //System.out.println(Arrays.toString(ch));


        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '-') {
                count1++;
            }
            if (ch[i] == '|') {
                count2++;
            }
        }
        if (count1 == 0 && count2 == 0) {
            System.out.println();
        } else if (count1 == count2) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}
