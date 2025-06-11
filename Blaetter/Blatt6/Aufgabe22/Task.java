import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Task {
    private String description;
    private int priority;

    public Task(String description) throws TaskException {
        setDescription(description);
        setPriority(1);
    }

    public Task(String description, int priority) throws TaskException {
        setDescription(description);
        setPriority(priority);
    }

    public String getDescription() {
        return this.description;
    }
    public int getPriority() {
        return this.priority;
    }

    public void setDescription(String description) throws TaskException {
        if (this.checkDescription(description)) {
            this.description = description;
        }
        else {
            throw new TaskException("description", description);
        }
    }

    public void setPriority(int priority) throws TaskException {
        if (this.checkPriority(priority)) {
            this.priority = priority;
        }
        else {
            throw new TaskException("priority", String.valueOf(priority));
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject.getClass().equals(Task.class)) {
            Task t = (Task) anObject;
            if (this.getDescription().contentEquals(t.getDescription())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static Task prioritize(Task task1, Task task2) {
        if (task1.getPriority() < task2.getPriority()) {
            return task1;
        } else if (task2.getPriority() < task1.getPriority()) {
            return task2;
        } else {
            if (Math.random() < 0.5) {
                return task1;
            } else {
                return task2;
            }
        }
    }

    public boolean checkDescription(String description) {
        return (description != null) && (description.isEmpty() == false);
    }

    public boolean checkPriority(int priority) {
        return 1 <= priority && priority <= 5;
    }

    @Override
    public String toString() {
        return description + " (" + priority + ")";
    }

    public static void main(String[] args) throws TaskException {
        Random r = new Random();
        ArrayList<Task> taskArray = new ArrayList<Task>();
        int counter = 1;

        while (taskArray.size() != 10) {
            int randomPriority = r.nextInt(1, 11);
            String description = "Testaufgabe " + counter;

            Task t = null;
            
            try {
                t = new Task(description, randomPriority);
            }
            catch (TaskException e) {
                ;
            }

            counter += 1;
            taskArray.add(t);
        }

        IntStream priorityStream = taskArray.stream().mapToInt(t -> t.getPriority());
        int highestPriority = priorityStream.min().orElse(0);

        System.out.println("The highest priority from the list of 10 tasks was: " + highestPriority);
    }
}
