class Table{
    synchronized void printTable(int n)
    {
        for(int i = 1; i<=5;i++)
            System.out.println(n*i);
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }
}


public class SyncDemo {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 m = new MyThread1(obj);
        MyThread2 n = new MyThread2(obj);
        m.start();
        n.start();
    }
    
}
