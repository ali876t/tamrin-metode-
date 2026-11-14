
package com.mycompany.metodtamrin3;


public class Metodtamrin3 {

    public static void main(String[] args) {
       
        for (int i = 1 ; i<=8 ; i++){
            System.out.print(fibo(i));
        }
    }
    public static int fibo(int n){
       
       if(n==1 || n==2){
           return 1 ;
       }
       else {
           return fibo(n-1)+fibo(n-2);
       }
    }
}
