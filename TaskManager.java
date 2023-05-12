import java.util.ArrayList;
import java.util.Comparator;

/*
This class is going to keep track of all the tasks that are created, and will be able to add, remove, and edit tasks.
 */
public class TaskManager {
    // An Array to store the tasks
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }
    // A method to add a task
    public void add(Task task) {
        tasks.add(task);
        // Sort the tasks (ArrayList) based on their UUIDs
        tasks.sort(Comparator.comparing(Task :: getTaskID));
    }
    // A method to remove a task
    public void remove(Task task) {
        tasks.remove(task);
    }
    // A method to display all the tasks
    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }
    // A method to display all the tasks IDs
    public void displayIDs() {
        for (Task task : tasks) {
            System.out.println(task.getTaskID());
        }
    }
    // A method to retrieve a task based on its ...
    // #TODO - Implement a way to store the tasks that'll allow for quick retrieval
}
