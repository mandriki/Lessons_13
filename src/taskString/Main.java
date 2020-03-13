package taskString;
import java.util.Scanner;
public class Main {
   /** 1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
    второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.*/
    public static void main(String[] args) {
        String Str = "0";
        for (int i = 0; i <= 10; i++) {
            Str += 1;
            System.out.println(Str);
        }
        StringBuilder sb = new StringBuilder("0");
        for (int i = 0; i <= 10; i++) {
            sb.append("1");
            System.out.println(sb);
        }
       /** Заменить все грустные смайлы :( в строке на весёлые :)*/
        String Str1 = new String("Очень грустно(((((((( или ))))");
        System.out.println(Str1);
        System.out.println(Str1.replace('(', ')'));
        /** Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
         * если строка начинается и заканчивается этим словом.
         */
        Str1 = "Мир, Труд, Мир";
        Str = "Мир";
        boolean isEnd = Str1.endsWith(Str);
        System.out.println("Строка заканчивается на Мир = "+ isEnd);
        boolean isStart = Str1.startsWith(Str);
        System.out.println("Строка начинается с Мир = "+ isStart);
       /**Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
        в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре,
        а результирующая строка должна быть в верхнем.*/
//        String f,i,o;
        String f = new String(" иван");
        String i = "степан";
        String o = "   Петрович  ";
        String fio = (String) f.trim().subSequence(0,1);
        String fio1 = (String) i.trim().subSequence(0,1);
        String fio2 = (String) o.trim().subSequence(0,1);
        System.out.println("Ф.И.О = "+fio.toUpperCase()+"."+fio1.toUpperCase()+"."+fio2.toUpperCase());

       /** Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.*/
        Scanner str = new Scanner("Эти    три    сcccлова");
        String sentence = str.nextLine();
        System.out.println("Слов в строке = " + words(sentence));
       /** Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним*/
        System.out.println("Строка = "+replay());
       /** 7. Написать функцию, принимающую на вход целое число*/
        System.out.println(integers());
        System.out.println(integers1());
        System.out.println(integers2());
    }
    public static int words(String str){
        int temp = 1;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                temp++;
            }
        }
    return temp;
    }
    public static String replay (){
        StringBuilder str = new StringBuilder("МирТруд,ММММир");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
              str.deleteCharAt(i + 1);
              i = i - 1;
             // System.out.println("Слов  = " + str);
            }
        }
       return str.toString();
    }
    public static String integers () {
        String str = Long.toString(55211222l + 10000000000L);
        return str.substring(str.length() - 10);
    }
    public static String integers1(){
        return String.format("%010d", 3000000l);
    }
    public static String integers2 () {
        StringBuilder str = new StringBuilder("000000000000000000").append(56466);
        return str.substring(str.length() - 10);
    }

}


/**        1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
        второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

        2. Заменить все грустные смайлы :( в строке на весёлые :)

        3. Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.

        4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
        в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

        5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.

        6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.

        Пример: aaabbcdeef ->abcdef

        7. Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули.
        Пример getString(22) -> 0000000022
        Найти 3 способа решения задачи и определить наиболее быстрый способ.

*/