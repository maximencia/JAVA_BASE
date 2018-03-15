package com.example.builder_example;

import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;


/**
 * Created by Maxim.Rumyantsev on 14-Mar-18.
 */
public class PaymentRegistry {

    Date registryDate;
    long paymentCount;
    double paymentSum;
    HashMap<String,Double> paymentRows;


    static public class Builder{

        Date registryDate;
        long paymentCount;
        double paymentSum;
        HashMap<String,Double> paymentRows;

        public Builder(Date registryDate){
            this.paymentRows =  new HashMap<String,Double>();
            this.registryDate = registryDate;
        }

        public void  setPaymentRow(String receriptNumber, Double paymentRow){
            paymentRows.put(receriptNumber,paymentRow);
        }

        private double  calculateTotalAmount(HashMap<String, Double> paymentRows) {
            for (Double value : paymentRows.values()) {
                paymentSum  += value;
            }
            return paymentSum;
        }

        public PaymentRegistry build () {

            this.paymentCount = paymentRows.size();
            this.paymentSum = calculateTotalAmount(paymentRows);
            return  new PaymentRegistry(this);

        }


    }



    public PaymentRegistry(Builder builder){
        this.paymentCount = builder.paymentCount;
        this.paymentRows = builder.paymentRows;
        this.registryDate=builder.registryDate;
        this.paymentSum=builder.paymentSum;
        // and so on ....
    }
    @Override
    public String toString() {

        return "Builder{" +
                "registryDate=" + registryDate +
                ", paymentCount=" + paymentCount +
                ", paymentSum=" + paymentSum +
                ", paymentRows=" + paymentRows +
                '}';
    }
}
