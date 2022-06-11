package homeWorkAgain;

import java.util.Arrays;
import java.util.Scanner;

public class CurlyBrackets extends Brackets{


    @Override
    public void examBrackets(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите математическое выражение: ");
        String str = in.next();
        char[] ch = str.toCharArray();
       // System.out.print(Arrays.toString(ch));

        for(int i = 0;i < ch.length;i++){
            if(ch[i] == '{'){
                count1++;
            }
            if(ch[i] == '}'){
                count2++;
            }
        }
        if(count1 == 0 && count2 == 0){
            System.out.println("Фигурных скобок нет!");
        }else if(count1 == count2){
            System.out.println("Фигурные скобки расставлены верно!");
        }else{
            System.out.println("Фигурные скобки расставлены неверно!");
        }
    }
}
