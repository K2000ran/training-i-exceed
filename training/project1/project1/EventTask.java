public class EventTask extends Task {
    public EventTask(String date, String description) {
        super(date, description);
    }

    @Override
    public void displayTask() {
        System.out.println("[Event] Date: " + date + ", Task: " + description + ", Completed: " + completed);
    }
}
