import java.util.Scanner;
class Demo
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
   System.out.println("Values are:");
 for(int i=0;i<n;i++)
  {
      System.out.println(arr[i]);
  }
}
}

