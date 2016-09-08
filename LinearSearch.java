
package linearsearch;
import java.util.Scanner;

public class LinearSearch {

 
    public static void main(String[] args) {
        int a, element;
        int  search, array[];
       
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of elements.");
    element = input.nextInt(); 
    array = new int[element];
 
    System.out.println("Enter " + element + " integers");
 
    for (a = 0; a < element; a++)
      array[a] = input.nextInt();
 
    System.out.println("Enter value to find");
    search = input.nextInt();
 
    for (a = 0; a < element; a++)
    {
      if (array[a] == search)
      {
         System.out.println(search + " is in index " + (a + 1) + ".");
          break;
      }
   }
   if (a == element) 
      System.out.println(" Error. No such number.");
  }
}