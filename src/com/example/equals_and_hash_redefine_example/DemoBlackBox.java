package com.example.equals_and_hash_redefine_example;

/**
 * Created by Maxim.Rumyantsev on 1/3/2018.
 */
class BlackBox {
    public int varA;
    public int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlackBox)) return false;

        BlackBox blackBox = (BlackBox) o;

        if (varA != blackBox.varA) return false;
        return varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        return result;
    }
}
public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        System.out.println(object1.equals(object2)); //false
        BlackBox object3 = new BlackBox(5, 10);
        BlackBox object4 = object3;// Переменная object4 ссылается на
        //тот-же объект что и переменная object3
        System.out.println(object3.equals(object4));//true
    }
}
