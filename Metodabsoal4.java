
package com.mycompany.metodabsoal4;


public class Metodabsoal4 {

    public static void main(String[] args) {
        
        String a ="ali";
        String b = "akbari";
        int x = 4;
        
        System.out.println(v(a,b,x));
                                                                                                                                                       
    }
    public static boolean  v (String a ,String b ,int x){
        int tedad = a.length();
        int tedad2 = b.length();
        if(x>tedad ||x>tedad2){
            return false;
        }
          String jadidA="";
          String jadidB="";
        
          for (int i =0;i<x ; i++){
              jadidA =jadidA +b. charAt(i);
              jadidB =jadidB +a. charAt(i);
              
          }
          for (int i = x ; i<tedad;i++){
               jadidA =jadidA +b. charAt(i);
          }
          for (int i = x ; i<tedad2;i++){
              jadidB =jadidA +a. charAt(i);
          }
          System.out.println(jadidA);
           System.out.println(jadidB);
          return true;
    }
}