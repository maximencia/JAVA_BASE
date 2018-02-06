package com.example.equals_and_hash_redefine_example;

/**
 * Created by Maxim.Rumyantsev on 1/3/2018.
 * https://habrahabr.ru/post/168195/
 */
public class EHR {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
    }

}
