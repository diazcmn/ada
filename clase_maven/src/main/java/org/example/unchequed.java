package org.example;

public class unchequed {

    public static void main(String[]args){

        int zero = 0 ;
        //int result = 10/zero;
        //System.out.println(result);

        //Unchequed Exception

        try {
            int result = 10 / zero;
            System.out.println(result);
        }catch(ArithmeticException a){

            System.out.println("error" + a.getMessage());
        }
    }
}
