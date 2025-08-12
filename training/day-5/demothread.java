class demT extends Thread {
    Thread t=new Thread(this);
    public void start() {
        System.out.println("thereas is startrd");
    }

    public void run() {
        System.out.println("thereas is runnunjg");
    }
}

public class demothread {
    public static void main(String[]args){
    demT obj=new demT();
    obj.start();
    obj.start();
    obj.run();
    obj.run();
    }
}
