
package com.mycompany.metodbaztamrin1;

public class Metodbaztamrin1 {

    public static void main(String[] args) {
       
        chap(5);
    }
    public static void chap(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        chap(n-1);
    }
}
