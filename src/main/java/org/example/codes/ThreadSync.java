package org.example.codes;


class Counter{
    public synchronized int getCount() {
        return count;
    }

    private int count=0;
    public synchronized void increment(){
        count++;
    }

}
public class ThreadSync {

    public static void main(String[] args) throws InterruptedException{

        Counter counter = new Counter();
        Thread t1= new Thread(()->{
            for(int i=0;i<100;i++){
                counter.increment();
            }
        });
        Thread t2= new Thread(()->{
            for(int i=0;i<100;i++){
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: "+counter.getCount());
    }
}
