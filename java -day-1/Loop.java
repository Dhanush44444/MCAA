import java.util.Scanner;
import java.util.Arrays;
class Loop
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value:");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter  "+n+"  numbers :");
  for(int i=0;i<n;i++)
  {
      arr[i]=sc.nextInt();
  }
  Arrays.sort(arr);
   System.out.println("Enter a numbers to print great to that number:");
   int a=sc.nextInt();
   System.out.println("great than "+a+" are");
  for(int i=0;i<n;i++)
  {
       if(arr[i]>a)
      {
         System.out.println(arr[i]);
       }
  }
}
}
  

      
  
   
   