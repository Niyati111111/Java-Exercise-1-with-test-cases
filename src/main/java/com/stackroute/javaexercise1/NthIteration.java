package com.stackroute.javaexercise1;

public class NthIteration {

    /* method to display nth number for n number of times */
    public String iterate(int n){

        String value="";

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                value += String.valueOf(i);
            }
        }
        System.out.println(" ");
        return value;
    }



    /* main method */


}
