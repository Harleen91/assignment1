public class prime
{
 public static void main(String[] args)
  {
   int a=20;
   flag=0;
   for(i=2;i<n;i++)
   {
    if(a%i== 0)
       {
        flag=1; 
        break;
       } 
   }
   if(flag==1)
    {
     System.out.print("NO.is not prime");
    }
   else
    {
    System.out.print("No. is Prime");
    }      
  }
}