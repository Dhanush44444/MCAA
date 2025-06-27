import java.util.*;
public class swapping1{
    public static void main(String args[]){
        Scanner sc=new Scajavacnner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a*b;
        b=a/b;
        a=a/b;
        String res=String.format("after sawpping\na=%d,b=%d",a,b);
        System.out.println(res);
    }
}