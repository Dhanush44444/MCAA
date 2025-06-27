import java.util.*;
public class differenceoftwostrings{
    public static void main(String aegs[]){
        String arr1[]={"Hello","Hai","Amar","Raju"};
        String arr2[]={"Hai","Hello","Ranjith","Karthik"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s:arr1)
        a.add(s);
        for(String s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u=new HashSet<>(a);
        u.removeAll(b);
        System.out.println(u);
    }
}