
package com.mycompany.metodtamrin5;

public class Metodtamrin5 {

    public static void main(String[] args) {
        
        v(3,'A','B','C');
    }
    public static void v (int n , char a , char c , char b){
        if(n==1){
            System.out.println(a +c);
            return;
        }
        v (n-1 , a ,b ,c);
        System.out.println(a+c);
        v (n-1 , b , c ,a);
    }
}
