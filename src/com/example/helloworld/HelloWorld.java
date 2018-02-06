package com.example.helloworld;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by Maxim.Rumyantsev on 12/4/2017.
 * http://info.javarush.ru/idea_help/2013/07/31/%D0%A1%D0%BE%D0%B7%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5-%D0%B8-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D0%BF%D0%B5%D1%80%D0%B2%D0%BE%D0%B3%D0%BE-Java-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D1%87%D0%B0%D1%81%D1%82%D1%8C-2-.html
 */
public class HelloWorld {
//    public static int factorial(int value) {
//
////        BigInteger ret = 1;
////        for (int i = 1; i <= value; ++i) ret=ret * i;
//        return value*value;

//    }
    public static BigInteger Factorial2(int num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
        //private String printTextPerRole(String[] roles, String[] textLines)
    public static String printTextPerRole(String[] roles, String[] textLines) {
        for (int c=0;c<textLines.length-1;c++)
           // ^((\w+)|(\w+\s\w+)|(\w+\s\w+\s\w+)):\s
    ////            причем я понял вот что смотри
    ////        тоесть для латинницы отрабатывает
    ////        а для кириллицы нет
    ////        вот
        {
         //   System.out.print((c + 1) + ")" + textLines[c].replaceAll(".*:\\s", "") + "\n");
         //   System.out.print(textLines[c]+"\n");
            //System.out.print((c + 1) + ")" + textLines[c].replaceAll("", "111") + "\n");
            System.out.print((c+1)+")"+textLines[c].replaceAll("^((\\w+)|(\\w+\\s\\w+)|(\\w+\\s\\w+\\s\\w+)):\\s","")+"\n");
            System.out.print((c+1)+")"+textLines[c].replaceAll("^([а-яА-Я ]+):\\s","")+"\n");
        }
            return "---";
    }
    public static void main(String[] args) {
//        int f = factorial(8);
//        System.out.print(f);
//
//        BigInteger f2 = Factorial2(3);
//        System.out.print(f2);
//


        System.out.println("Hello,World");
//        int mouse; // число мышек
//        int weight; // вес кота в граммах
//        mouse = 5;
//        weight = 4500;
//
//        if (mouse != 0 & weight / mouse < 1000) {
//            System.out.println("Можно кормить кота");
//
//
//        }
//        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
//

    String rolest="Городничий\n" +
            "Аммос Федорович\n" +
            "Артемий Филиппович\n" +
            "Лука Лукич";
    String textLinest="Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
            "Аммос Федорович: Как ревизор?\n" +
            "Артемий Филиппович: Как ревизор?\n" +
            "Artermi Filio: Kfr hevizor&&?\n" +
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
            "Аммос Федорович: Вот те на!\n" +
            "Артемий Филиппович: Вот не было заботы, так подай!\n" +
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!";
    String[] roles = rolest.split("\n");
    String[] textLines = textLinest.split("\n");

    System.out.print(printTextPerRole(roles,textLines));
















//
//
////===================================================================================================================
//        boolean p,q;
//        int i;
//        p=true; q=true;
//
////                ^ и !=
////                | и !=
////                & и ==
////                | и ||
//
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p^q) + "\t" + (p!=q) + "\t" + (p|q) + "\t" + (p!=q) + "\n" );
//
//        p=true; q=false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p^q) + "\t" + (p!=q) + "\t" + (p|q) + "\t" + (p!=q) + "\n" );
//
//        p=false; q=true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p^q) + "\t" + (p!=q) + "\t" + (p|q) + "\t" + (p!=q) + "\n" );
//
//        p=false; q=false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p^q) + "\t" + (p!=q) + "\t" + (p|q) + "\t" + (p!=q) + "\n" );
//
//        System.out.println("---\n");
//
//        //                & и ==
//        //                | и ||
//
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p==q) + "\t" + (p|q) + "\t" + (p||q) + "\n" );
//
//        p=true; q=false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p==q) + "\t" + (p|q) + "\t" + (p||q) + "\n" );
//
//        p=false; q=true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p==q) + "\t" + (p|q) + "\t" + (p||q) + "\n" );
//
//        p=false; q=false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p==q) + "\t" + (p|q) + "\t" + (p||q) + "\n" );
//
//        System.out.printf("-----------\n\n");
//
////===================================================================================================================
//
//
//        int v_year; // число мышек
//        v_year = 1200;
//        v_year=v_year/4 + v_year/400 - v_year/100;
//        System.out.print(v_year + " \n") ;
//
//        double a,b,c; // число мышек
//        a=0.1;
//        b=0.2;
//        c=0.3;
//         //c=a+b;
//
//        System.out.print(String.valueOf(Math.rint(1000*(a+b))==c*1000) + " \n") ;
//
//        System.out.print(0x0bp3*2+ "\n");
//
//        // вывод числа в двоичном виде
//        //Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. Данная задача актуальна, например, при работе с битовыми полями.
//        // Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
//        //Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//        int v_num;
//        int v_set;
//        v_num=10;
//        System.out.println(Integer.toString(v_num,2)+ "\n");
//        v_set=2-1;
//        v_set= (int) Math.pow(2,v_set);
//
//        v_num= v_num ^ v_set; //http://www.pvsm.ru/java/39711
//
//        System.out.println(Integer.toString(v_num,2)+ "\n");
//
//
//        //Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа
//        // "\" (обратный слэш) на расстоянии a.
////        System.out.println((char) "\");        // A
////        System.out.println((char) ("\\" + 1)); // B
//        System.out.println( (char)((int) '\\'+10));
//        System.out.print("=================================================\n");
//
////===================================================================================================================
//
//
//
//        //http://www.pvsm.ru/java/39711
////        Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
////
////        Решать можно разными способами:
////
////        воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
////        применив пару трюков из двоичной арифметики;
////        написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
//        int value;
//        value=-17;
//        v_num=1;
//        value = Math.abs(value);
//        //value =Integer.toString(value,2);
//        String str;
//        str=Integer.toString(value,2);
//        char [] myCharArray = str.toCharArray();
//        //System.out.print(myCharArray[1]);
//        //System.out.printf(Arrays.stream(myCharArray).sum());
//        int sum=0;
//        boolean result;
//        result=false;
//        for ( i = 0; i <  myCharArray.length; i++) {
//            System.out.print(myCharArray[i]+"\n");
//            sum+= Character.getNumericValue (myCharArray[i]);
//            System.out.print(sum+"-  \n");
//        }
//        if (sum == 1)
//        {
//            result=true;
//        }
//
//        //Выберите выражения, которые дадут в качестве результата строку A12.
//
//        System.out.print(result);
//        System.out.printf("\n");
//        System.out.printf("A" + 12);
//        System.out.printf("\n");
//        System.out.printf("A" + ('\t' + '\u0003'));
//        System.out.printf("\n");
//        System.out.printf('A' + "12");
//        System.out.printf("\n");
//        System.out.printf('A' + '1' + "2");
//        System.out.printf("\n");
//        //Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
//        // Палиндромом называется строка, которая читается одинаково слева направо
//        // и справа налево (в том числе пустая). При определении "палиндромности"
//        // строки должны учитываться только буквы и цифры. А пробелы, знаки препинания,
//        // а также регистр символов должны игнорироваться. Гарантируется, что в метод
//        // попадают только строки, состоящие из символов ASCII (цифры, латинские буквы,
//        // знаки препинания). Т.е. русских, китайских и прочих экзотических символов в
//        // строке не будет.
////
////        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
//// ввода-вывода добавит проверяющая система.
////
////                Подсказки (не читайте, если хотите решить сами):
////
////        для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться
//// регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
////        для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
//// который находится в классе StringBuilder;
////        в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
////        Sample Input:
////        Madam, I'm Adam!
////        Sample Output:
////        true
//
////===================================================================================================================
//
//
//
        String text;
        Boolean result=false;
        text="Madam, I'm Adam!";
        //text="TO,-+   P ,,,,OT!";
        //text="TOR,-+   P ,,,,OT!";
       // System.out.printf(text+"\n");
        // удалим - все лишнее
        text=text.replaceAll("[^a-zA-Z0-9]","");
        //System.out.printf(text+"\n");
        text=text.toLowerCase();
        System.out.printf(text+"\n");
        StringBuilder text2 = new StringBuilder(text);
        //System.out.println("string = " + text2.reverse());
        //if (text.equals(text2.toString())) {
        //    result=true;

        //}
        System.out.print(text.equals(text2.toString())+"\n");
//
//
////        System.out.printf(Integer.toBinaryString(value) + "-----");
////        while(v_num < 1) {
////
////            System.out.print(v_num + "\n");
////            System.out.println(Integer.toString(v_num, 2) + "\n");
////            v_num++;
////
////
////        }
////
///**
// * Checks if given <code>text</code> is a palindrome.
// *
// * @param text any string
// * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
// */
//        public static boolean isPalindrome(String text) {
//            char[] data_in = text.toCharArray();
//            String trimmed_string = new String("");
//            for (char i : data_in) {
//                if ((i >= 'a' && i <= 'z') |
//                        (i >= 'A' && i <= 'Z') | (i >= '0' && i <= '9')) {
//                    trimmed_string += i;
//                }
//            }
//
//            StringBuilder reverse_string = new StringBuilder(trimmed_string);
//            reverse_string.reverse();
//
//            return trimmed_string.equalsIgnoreCase(reverse_string.toString());
//
//        }

    }
    }

