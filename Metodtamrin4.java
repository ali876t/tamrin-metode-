
package com.mycompany.metodtamrin4;

public class Metodtamrin4 {

    public static void main(String[] args) {
        System.out.println(v(0));
    }
    public static int v (int n){
        if (n<2){
            return n;
            
        }
        return v (n/2)+(n%2);
    }
}
