
package com.mycompany.metodeaxy;

public class Metodeaxy {

    public static void main(String[] args) {
       
        String a ="aliakbari";
        int x = 6;
        int y = 4;
        System.out.println(v(a,x,y));
        
    }
    public static String v (String a  ,int x, int y){
         int tedad = a.length();
         if ( x>tedad || y >tedad || x>y){
             return "";
         }
         String aazzaa="";
         for (int i =x-1;i<y;i++){
             aazzaa = aazzaa +a.charAt(i);
         }
         return aazzaa;
         
    }
}
