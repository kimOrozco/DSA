
package binarysearch;

import java.util.Random;
import java.util.Scanner;


public class BinarySearch {
     static int c, left, right, middle, n, search, size, array[], table =0;
     
     public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     Random  rand = new Random();

    

     System.out.print("Enter number of elements:");
  
     size = input.nextInt();
     array = new int [size];
     System.out.println();
     System.out.print( size + " Random number to be generated  ");
         
     System.out.println();
     
         for ( int x = 0; x< size; x++){
             array[x] = rand.nextInt(1000);
             
             System.out.print(array[x] + "\t");
             table+=1;
             
             if(table==10){
             System.out.println("");
             table=0;
             }
         }
         System.out.println();
      
         for ( int x = 0; x <size-1; x++){
             for  (int y= 0 ; y< size-x-1; y++){
              if (array[y] > array [y+1])
              {
                  int swap = array [y];
                  array[y] = array [y+1];
                  array [y+1] = swap;
                  
              }
         }
         }
         System.out.println();
         
         System.out.println (" Bubble sorting .... DONE ");
 
    for ( int x = 0 ; x< size ; x++){
            System.out.print(array[x] + "\t");
            table+=1;
            if(table==10){
                 System.out.println("");
                 table=0;
             }
        }
    System.out.println();
 
    System.out.print("Enter value to find: ");
    search = input.nextInt();
 
    left  = 0;
    right = array.length -1;
    middle = (left+ right)/2;
 
    while( left <= right ){
         middle = left + (right - left)/2;
        
         if ( array[middle] < search ){
         left = middle + 1; 
         } else if ( array[middle] == search ){
         System.out.println(search+ " found at location " + (middle+1)+".");
         break;
         }else
         right = middle - 1;
         }
         middle = (left + right)/2;
         if(left > right){
             System.out.println(search +" is not present in the list.");
         }
    } 
}
  
    


