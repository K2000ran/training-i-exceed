import java.io.Serializable;

public abstract class Task implements Serializable {
    protected String date;
    protected String description;
    protected boolean completed;

    public Task(String date, String description) {
        this.date = date;
        this.description = description;
        this.completed = false;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public abstract void displayTask();
}
