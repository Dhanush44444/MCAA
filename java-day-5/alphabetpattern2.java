import java.util.*;
public class alphabetpattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=1;i++)
        {
            for(int j=1;j<=1;j++)
            {
                System.out.print((char)(64+j)+" ");
                  
            }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--)
            {
                for(int j=1;j>=1;j--)
                {
                    System.out.println((char)(64+j)+" ");
                }
                
            }
            System.out.println();
        }
    }   
