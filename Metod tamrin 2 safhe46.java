
package com.mycompany.metodbaztamrin2;

public class Metodbaztamrin2 {

    public static void main(String[] args) {
        
        System.out.println(v(2,3));
    }
    public static int v (int a ,int b){
        if (b==0){
            return 1 ;
        }
        return a * v (a,b-1);
    }
}
