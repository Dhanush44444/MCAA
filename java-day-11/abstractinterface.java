import java.util.*;
abstract interface math{
    void print();
}
class d implements math{
    public void print(){
        System.out.println("Hello J");
    }
}
public class abstractinterface{
    public static void main(String [] args){
        d f=new d();
        f.print();
    }
}