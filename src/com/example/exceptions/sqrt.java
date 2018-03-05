package com.example.exceptions;



//Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(), это метод при передаче отрицательного
//        параметра должен бросать исключение java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
//        где вместо вопросика будет подставлено фактически переданное в метод число.
//
public class sqrt {

    public static double sqrt(double x) {
        if (x>0) {return Math.sqrt(x);}
        else {throw new IllegalArgumentException("Expected non-negative number, got " + x);}
    }
    //вот этот рабочий
    public static double sqrt_2(double x) {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println(sqrt(3.0));
        try {
            System.out.println(sqrt(-1.0));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }



    public static void main1(String[] args) {
//        int f = factorial(8);
//        System.out.print(f);
//
//        BigInteger f2 = Factorial2(3);
//        System.out.print(f2);
//


        System.out.println("Hello,World");
        System.out.println(sqrt(-4));
    }
}