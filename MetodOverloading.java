
package com.mycompany.metodoverloading;

public class MetodOverloading {

    public static void main(String[] args) {
        
        System.out.println(v (5));
        System.out.println(v (4,6));
        System.out.println(v (3.0,4.0));
        
    }
    public static double v (int r){
        return 3.14*r*r;
    }
    public static int v(int a , int b){
        return a*b;
    }
    public static double v (double gaede , double ertefa){
        return (gaede*ertefa)/2;
            
            }
}
