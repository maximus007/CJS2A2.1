import java.util.Scanner;
 
class Largest
{
   public static void main(String args[])
   {
      int a, b, c; // Decalaring variables//
      System.out.println("Enter three integers "); 
      Scanner in = new Scanner(System.in); // Scanner class for user input//
 
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
 
      if ( a > b && a > c ) // If condition and logical and operator to verify the condition//
         System.out.println("First number is largest.");// If the statement is true then print this//
      else if ( b > a && b > c )//Else if condition//
         System.out.println("Second number is largest.");
      else if ( c > a && c > b )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}