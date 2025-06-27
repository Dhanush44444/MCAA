import java.util.*;
public class methodreferenceprogram{
    void display()
    {
        System.out.println("hello student");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[]){
        
        methodreferenceprogram o=new methodreferenceprogram();
    o.dis1();
    }
}
