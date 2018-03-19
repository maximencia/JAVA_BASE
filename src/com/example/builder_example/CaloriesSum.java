package com.example.builder_example;

import java.util.HashSet;

/**
 * Created by Maxim.Rumyantsev on 13-Mar-18.
 */
public class CaloriesSum {
    HashSet<NutritionFacts2> cocaColaBox;
    public int getParams(){
    return cocaColaBox.stream().mapToInt(NutritionFacts2::getCalories).sum();
    }

}
