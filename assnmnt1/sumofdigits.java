public class sumofdigits
{
 public static void main(String[] args)
  {
    int num=128,a,b,c;
    
    {
     a=num / 100;
     b=num%100 /10;
     c=num%10 ;
     num=a+b+c;
     }
    {
     System.out.print("sum of digit is="+num);
    }
  }
}