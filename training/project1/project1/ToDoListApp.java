import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. See Pending Tasks");
            System.out.println("4. See All Tasks");
            System.out.println("5. Save Tasks to File");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter type (event/work): ");
                    String type = sc.nextLine();

                    Task task;
                    if (type.equalsIgnoreCase("event")) {
                        task = new EventTask(date, desc); // Upcasting
                    } else {
                        task = new WorkTask(date, desc); // Upcasting
                    }

                    manager.addTask(task);

                    // Downcasting example
                    if (task instanceof EventTask) {
                        EventTask et = (EventTask) task;
                        System.out.println("🔍 Downcasted: Event date is " + et.getDate());
                    }
                    break;

                case 2:
                    System.out.print("Enter description of task to delete: ");
                    String delDesc = sc.nextLine();
                    manager.deleteTask(delDesc);
                    break;

                case 3:
                    manager.showPendingTasks();
                    break;

                case 4:
                    manager.showAllTasks();
                    break;

                case 5:
                    manager.saveToFile();
                    break;

                case 6:
                    manager.saveToFile();
                    System.out.println("👋 Exiting...");
                    return;

                default:
                    System.out.println("⚠ Invalid choice!");
            }
        }
    }
}
