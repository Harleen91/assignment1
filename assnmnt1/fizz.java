public class fizz
{
 public static void main(String[] args)
  {
   int a=20;
   if(a%3 == 0)
     {
      if(a%5 == 0)
        {
         System.out.print("FIZZBUZZ");
        }
      else
        {
         System.out.print("Fizz");
        }
     }
   else if(a%5 == 0)
     {
      System.out.print("Buzz");
     }
   else
     {
      System.out.print("statement not found");
     }
  }
}