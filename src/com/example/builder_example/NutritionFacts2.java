package com.example.builder_example;

/**
 * Created by Maxim.Rumyantsev on 13-Mar-18.
 */
// Builder Pattern
public class NutritionFacts2 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public int getCalories() {
        return calories;
    }

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val)
        { calories = val; return this; }

        public Builder fat(int val)
        { fat = val; return this; }

        public Builder carbohydrate(int val)
        { carbohydrate = val; return this; }

        public Builder sodium(int val)
        { sodium = val; return this; }

        public NutritionFacts2 build() {
            return new NutritionFacts2(this);
        }
    }
    private NutritionFacts2(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium+builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts2{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
