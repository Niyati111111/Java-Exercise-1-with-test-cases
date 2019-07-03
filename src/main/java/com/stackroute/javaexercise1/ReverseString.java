package com.stackroute.javaexercise1;

import java.util.*;

public class ReverseString {

    /* method to reverse a string */
    public String reverse(String str) {
<<<<<<< HEAD

        if(str==""){
            return "Invalid Input!";
        }

=======
        
        if(str==""){
            return "Invalid Input!";
        }
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] reverseArray = new char[length];
        int j=0;
        String value = "";
        for(int i=length-1; i>=0; i--) {
            reverseArray[j] = charArray[i];
            j++;
        }

        value += String.valueOf(reverseArray);

        return value;
    }

    /* main method */

}
