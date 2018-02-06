package com.example.integral;


import com.sun.scenario.effect.impl.prism.ps.PPStoPSWDisplacementMapPeer;

import javax.swing.plaf.synth.SynthToggleButtonUI;
import javax.xml.stream.events.StartDocument;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.DoubleUnaryOperator;

import static java.lang.Math.sin;

/**
 * Created by Maxim.Rumyantsev on 04-Feb-18.
 */
public class get_integral {

    public static void main(String[] args) {
        double xx;
        //xx = integrate(x -> 10, 0, 10);
        //System.out.println("Hello,World - " + integrate(x -> 1, 0, 10));
        System.out.println("1");
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println("2");
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println("3");
        System.out.println(integrate(x -> sin(x) / x, 1, 5));//0.603848
    }
        public static double integrate (DoubleUnaryOperator f,double a, double b) {

            double x, S = 0, h, n = 10000000;
            //System.out.println(n);
            //System.out.println(n-1);
            h = (b - a) * 1.0 / n ;
            for (int i = 0; i < n; i++) {
                x = a + i * h;
                S = S + f.applyAsDouble(x);
            }
            S = h * S;
            double result = new BigDecimal(S).setScale(5, RoundingMode.UP).doubleValue();
            //ваш код
            return result;
        }

    }

//Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
//
//Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
//
//Интервал интегрирования задается его конечными точками a и b, причем a<=b. Для получения достаточно точного результата используйте шаг сетки не больше 10−6.
//
//Пример. Вызов
//
//integrate(x -> 1, 0, 10)
//должен возвращать значение 10.
//формула должна быть такой
//S - площадь
//f - функция
//a, b - координаты отрезка
//n - на сколько частей мы делим указанный отрезок. он определяет точность и в данном задании это должна быть одна миллионная
//i - текущая миллионная доля отрезка.
//
//h = (b - a) / n
//S = S + f(a + h * (i + 0.5))