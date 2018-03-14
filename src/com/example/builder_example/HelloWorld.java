package com.example.builder_example;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Maxim.Rumyantsev on 12/4/2017.
 * http://info.javarush.ru/idea_help/2013/07/31/%D0%A1%D0%BE%D0%B7%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5-%D0%B8-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D0%BF%D0%B5%D1%80%D0%B2%D0%BE%D0%B3%D0%BE-Java-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D1%87%D0%B0%D1%81%D1%82%D1%8C-2-.html
 */
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello,World");

        NutritionFacts2 cocaCola = new NutritionFacts2.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

        HashSet<NutritionFacts2> cocaColaBox = new HashSet<>();
        cocaColaBox.add(cocaCola);
        cocaColaBox.add(new NutritionFacts2.Builder(234,1).calories(12).build());

        int sum = cocaColaBox.stream().mapToInt(NutritionFacts2::getCalories).sum();
        System.out.println(cocaColaBox.size());
        System.out.println(sum);



        NutritionFacts pepsi = new NutritionFacts(130,32);
        System.out.println(cocaCola.toString());
        System.out.println(pepsi.toString());


        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

        PaymentRegistry.Builder builder;

        builder = new PaymentRegistry.Builder(date);
        builder.setPaymentRow("vkdkdkd","djkdkjdk");
        builder.setPaymentRow("123","123");
        builder.setPaymentRow("djsdkjflkjdf", "kjdjsjdflkjsal");
        PaymentRegistry registry = builder.build();
        System.out.println(registry);




//                                  .queryParams(queryParams);
//        for (MultiPartSpecification multiPart:bodyParams.values()) {
//            requestSpecification = requestSpecification.multiPart(multiPart);
//        }


    }

}