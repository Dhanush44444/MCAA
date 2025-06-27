public class alivemethod{
    public static void main(String args[]){
        Runnable r=()->System.out.println("i am new fromjava8 version");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}
