class sample extends Thread{
    Thread t=new Thread(this);
    public void run(){
        System.out.println("THe thread name is :"+ t.getName());
        t.setName("my thread");
        System.out.println("THe thread name is :"+ t.getName());
    }
}
public class demo2 {
    public static void main(String [] args){
        sample s=new sample();
        Thread th=Thread.currentThread();
        System.out.println("THe thread name is :"+ th.getName());
        s.start();
    }
}
