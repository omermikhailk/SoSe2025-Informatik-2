import java.util.Random;

class Task {
    private String description;
    private int priority;

    public Task(String description) {
        this.setDescription(description);
        this.priority = 1;
    }

    public Task(String description, int priority) {
        this.setDescription(description);
        this.setPriority(priority);
    }

    public void setDescription(String description) {
        if (this.checkDescription(description)) {
            this.description = description;
        }
    }

    public void setPriority(int priority) {
        if (this.checkPriority(priority)) {
            this.priority = priority;
        }
    }

    public boolean checkDescription(String description) {
        return description instanceof String;
    }

    public boolean checkPriority(int priority) {
        if (Integer.class.isInstance(priority)) {
            return 1 <= priority && priority <= 5;
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }
    
    public int getPriority() {
        return this.priority;
    }

    public String toString() {
        return "Task '" + this.description + "' with priority " + this.priority; 
    }

    public boolean equals(Object anObjekt) {
        if (anObjekt != null) {
            if (anObjekt instanceof Task) {
                Task typecasted = (Task) anObjekt;
                if (typecasted.getDescription() == this.getDescription()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Task prioritize(Task t1, Task t2) {
        int p1 = t1.getPriority();
        int p2 = t2.getPriority();

        if (p1 > p2) {
            return t2;
        }
        if (p1 < p2) {
            return t1;
        }
        else {
            Random r = new Random();
            double flip = r.nextDouble();
            if (flip >= 0.5) {
                return t2;
            }
            return t1;
        }
    }
}


class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Zimmeraufraeumen");
        Task t2 = new Task("Bearbeiten des Uebungsblatt", 5);
        Task t3 = new Task("Bearbeiten des Uebungsblatt");
        
        printTask(t1);
        printTask(t2);
        printTask(t3);

        printTaskEquality(t1, t2);
        printTaskEquality(t2, t3);

        printPriorityTask(t1, t2);
        for (int i = 0; i < 5; i++) {
            printPriorityTask(t1, t3);
        }
    }

    public static void printTask(Task t) {
        System.out.println(t.toString());
    }

    public static void printPriorityTask(Task t1, Task t2) {
        System.out.println(t1.getDescription());
        System.out.println(t2.getDescription());
        if (Task.prioritize(t1, t2) == t1) {
            System.out.println(t1.toString() + " ist wichtiger!");
        }
        else if (Task.prioritize(t1, t2) == t2) {
            System.out.println(t2.toString() + " ist wichtiger!");
        }
    } 

    public static void printTaskEquality(Task t1, Task t2) {
        if (t1.equals(t2)) {
            System.out.println("Die beide Aufgaben sind gleich!");
        }
        else {
            System.out.println("Die beide Aufgaben sind nicht gleich!");
        }
    }
}

