
package com.mycompany.metodax;

public class Metodax {

    public static void main(String[] args) {
        
        String a ="aliakbari";
        int x =3;
        System.out.println (v(a,x));
    }
    public static String v (String a , int x){
        int tedad = a.length();
        if(x> tedad){
            return "";
            
        }
        else{
                    if (x<=tedad){
                    
                    }
                    return a .substring(0,x);
                    }
    }
}
