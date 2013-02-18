public class upptolow
{
 public static void main(String[] args)
  {
   int a=102 ;
   
   if(a>='A'&& a<='Z')
   {
    System.out.printf("no. is "+(a +('a'-'A'))); 
   }
   else
   {
    System.out.printf("no. is "+(a -('a'-'A')));
   }

  }
}