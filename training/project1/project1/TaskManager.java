import java.io.*;
import java.util.*;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private final String fileName = "tasks.txt";
    private boolean readyForCompletion = false;

    public TaskManager() {
        loadFromFile();
    }

    public synchronized void addTask(Task task) {
        tasks.add(task);
        System.out.println("📌 Task added: " + task.getDescription());
        readyForCompletion = true;
        notify();
    }

    public void deleteTask(String desc) {
        boolean removed = tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(desc));
        if (removed) {
            System.out.println(" Task deleted: " + desc);
        } else {
            System.out.println(" Task not found.");
        }
    }

    public synchronized void markTasks() {
        while (!readyForCompletion) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        Scanner sc = new Scanner(System.in);
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                task.displayTask();
                System.out.print("Mark this task as completed? (yes/no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    task.markCompleted();
                }
            }
        }
        readyForCompletion = false;
    }

    public void showPendingTasks() {
        System.out.println("\n Pending Tasks:");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                task.displayTask();
            }
        }
    }

    public void showAllTasks() {
        System.out.println("\n All Tasks:");
        for (Task task : tasks) {
            task.displayTask();
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(tasks);
            System.out.println(" Tasks saved to file.");
        } catch (IOException e) {
            System.out.println("❌ Error saving tasks: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File file = new File(fileName);
        if (!file.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Task> loadedTasks = (List<Task>) ois.readObject();
            tasks.clear();
            tasks.addAll(loadedTasks);
            System.out.println(" Loaded " + tasks.size() + " tasks from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Could not load tasks: " + e.getMessage());
        }
    }
}
