class SharedResource {
    private boolean isDataReady = false;

    public synchronized void produceData() {
        System.out.println("Producer: Preparing data...");
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isDataReady = true;
        System.out.println("Producer: Data is ready. Notifying consumer...");
        notify(); // Notify the waiting consumer
    }

    public synchronized void consumeData() {
        System.out.println("Consumer: Waiting for data...");
        while (!isDataReady) {
            try {
                wait(); // Wait until producer notifies
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer: Consuming the data.");
    }
}

class ProducerThread extends Thread {
    private SharedResource resource;

    public ProducerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.produceData();
    }
}

class ConsumerThread extends Thread {
    private SharedResource resource;

    public ConsumerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.consumeData();
    }
}

public class demothreadcomm {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        ProducerThread producer = new ProducerThread(resource);
        ConsumerThread consumer = new ConsumerThread(resource);

        consumer.start(); // Start consumer first
        producer.start(); // Then start producer

        try {
            producer.join(); // Wait for producer to finish
            consumer.join(); // Wait for consumer to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread: Both threads have completed.");
    }
}
