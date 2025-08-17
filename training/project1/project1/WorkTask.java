public class WorkTask extends Task {
    public WorkTask(String date, String description) {
        super(date, description);
    }

    @Override
    public void displayTask() {
        System.out.println("[Work] Date: " + date + ", Task: " + description + ", Completed: " + completed);
    }
}
