import java.util.Scanner;
class Statement1
{
public static void main(String args[])
{
   System.out.println("Enter 3 number to find greater number:");
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
	if(a>b || a<c)
	{
	     if(a>c)
	     {
	          System.out.println(a+"is big");
	     }
	    else
	    {
	       System.out.println(c+"is big");
	    }
	}
 	else
	{
	       System.out.println(b+" "+"is big");
	 }
}
}