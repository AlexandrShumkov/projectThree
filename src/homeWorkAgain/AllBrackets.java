package homeWorkAgain;

import java.util.Arrays;
import java.util.Scanner;

public class AllBrackets extends Brackets {
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;

    @Override
    public void examBrackets() {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �������������� ���������: ");
        String str = in.next();
        char[] ch = str.toCharArray();
        // System.out.print(Arrays.toString(ch));


        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                count1++;
            }
            if (ch[i] == ')') {
                count2++;
            }
        }
        if (count1 == 0 && count2 == 0) {
            System.out.println("������� ������ ���!");
        } else if (count1 == count2) {
            System.out.println("������� ������ ����������� �����!");
        } else {
            System.out.println("������� ������ ����������� �������!");
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '[') {
                count3++;
            }
            if (ch[i] == ']') {
                count4++;
            }
        }
        if (count3 == 0 && count4 == 0) {
            System.out.println("���������� ������ ���!");
        } else if (count3 == count4) {
            System.out.println("���������� ������ ����������� �����!");
        } else {
            System.out.println("���������� ������ ����������� �������!");
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{') {
                count5++;
            }
            if (ch[i] == '}') {
                count6++;
            }
        }
        if (count5 == 0 && count6 == 0) {
            System.out.println("�������� ������ ���!");
        } else if (count5 == count6) {
            System.out.println("�������� ������ ����������� �����!");
        } else {
            System.out.println("�������� ������ ����������� �������!");
        }
    }


}
