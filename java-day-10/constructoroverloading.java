import java.util.*;
public class constructoroverloading{
    String name;
    constructoroverloading()
    {
        name="rajesh";
    }
    constructoroverloading(String name)
{
    this.name=name;
}

void display()
{
    System.out.println(name);
}
public static void main(String args[]){
constructoroverloading o=new constructoroverloading();
o.display();
constructoroverloading o1=new constructoroverloading("priya");
o1.display();
}
}
