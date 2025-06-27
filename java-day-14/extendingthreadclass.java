class a extends Thread{
    public void r()
    {
        System.out.println("hello I'm thread");
    }
}
public class extendingthreadclass{
    public static void main(String args[]){
        a g=new a();
        g.r();
        g.start();
    }
}
