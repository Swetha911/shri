import java.util.Scanner;
public class revdig {
 

   public static void main(String args[])
   {
      int num;
      int reversenum =0;
      System.out.println("enter number: ");
      
      Scanner in = new Scanner(System.in);
      
      num = in.nextInt();
      
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}
   
