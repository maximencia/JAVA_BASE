package com.example.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class sqrt {

    private static final Logger LOGGER= Logger.getLogger(sqrt.class.getName());

    public static double sqrt(double x) {
        if (x > 0) {
//            LOGGER.setLevel(Level.ALL);
//            LOGGER.log(Level.FINE,"LOG LEVEL FINE");
//            LOGGER.setLevel(Level.ALL);
//            LOGGER.info("Some message");
//            System.out.println(LOGGER.getParent().getLevel().toString());
////            LOGGER.getParent().setLevel(Level.ALL);
//            System.out.println(LOGGER.getParent().getLevel().toString());
//            System.out.println(LOGGER.getLevel().toString());
            LOGGER.log(Level.INFO,"LEVEL INFO");
            LOGGER.log(Level.SEVERE,"LEVEL SEVERE");
            LOGGER.log(Level.WARNING,"LEVEL WARNING");
            LOGGER.log(Level.FINE,"LEVEL FINE");
            LOGGER.log(Level.FINEST,"LEVEL FINEST");
            LOGGER.log(Level.FINER,"LEVEL FINER");
            return Math.sqrt(x);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);

        }
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}