
package com.mycompany.metodtamrin6;


public class Metodtamrin6 {
    public static void main(String[] args) {

          int[] a = { 4, 3 , 2 , 3 , 2 ,  1};
          
          int[] b = new int[ a .length ];

        int tedad = v(a, 0, b, 0);

        for (int i = 0; i < tedad ; i++) {
            
            System.out.print(b[i] + " ");
        }
    }

    public static int v(int[] a , int index , int[] b , int count ) {

        if ( index == a.length ) {
            
            return count;
            
        }

        boolean mojood = false;

        for ( int i = 0; i < count; i++ ) {
            
            if (a[index] == b[i]) {
                
                mojood = true;
            }
        }

        if (mojood == false) {
            
            b[count] = a[index];
            
            count++;
        }

        return v ( a, index + 1, b , count );
    }
}