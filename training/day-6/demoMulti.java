class sample extends Thread{
    
public synchronized void run(){
    
    for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+ " iteration"+ i);
    }
}
}
public class demoMulti {
    public static void main(String[] args)throws InterruptedException{
        sample t1=new sample();
        sample t2=new sample();
        t1.start();
        t1.join();
        t2.start();
       
    }
}
