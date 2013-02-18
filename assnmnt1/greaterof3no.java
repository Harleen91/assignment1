public class greaterof3no
{
 public static void main(String[] args)
  {
   int a=10,b=20,c=50;
   if(a>b && a>c)
    { 
     System.out.print("The greatest no. is a = "+a);
    }
   else if(b>c && b>a)
    {
     System.out.print("The greatest no. is b = "+b); 
    } 
   else
    {
     System.out.print("The greatest no is c = "+c);
    }

  }
}