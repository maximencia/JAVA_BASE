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
    int paymentSum;
    HashMap<String,String> paymentRows;


    static public class Builder{

        Date registryDate;
        long paymentCount;
        double paymentSum;
        HashMap<String,String> paymentRows;

        public Builder(Date registryDate){
            this.paymentRows =  new HashMap<String,String>();
            this.registryDate = registryDate;
        }

        public void  setPaymentRow(String receriptNumber, String paymentRow){
            paymentRows.putIfAbsent(receriptNumber,paymentRow);
        }

        private int  calculateTotalAmount() {
            return 777;
        }

        public PaymentRegistry build () {

            this.paymentCount = paymentRows.size();
            this.paymentSum = calculateTotalAmount();
            return  new PaymentRegistry(this);

        }


    }



    public PaymentRegistry(Builder builder){
        this.paymentCount = builder.paymentCount;
        this.paymentRows = builder.paymentRows;
        this.registryDate=builder.registryDate;
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
