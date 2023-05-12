import java.io.*;
import java.util.ArrayList;
/*
This class is going to be able to store and load tasks from a file.
 */
public class TaskSerialization {

    public static void main(String[] args) {

        // Create some sample tasks
        Task task1 = new Task("Task 1", "This is task 1", "13/05/2023", "Active");
        Task task2 = new Task("Task 2", "This is task 2", "13/05/2023", "Inactive");
        Task task3 = new Task("Task 3", "This is task 3", "13/05/2023", "Active");

        // Create an ArrayList to store the tasks
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        // Serialize the tasks to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("tasks.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(tasks);
            out.close();
            fileOut.close();
            System.out.println("Tasks saved to tasks.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize the tasks from the file
        try {
            FileInputStream fileIn = new FileInputStream("tasks.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Task> deserializedTasks = (ArrayList<Task>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Tasks loaded from tasks.ser");
            for (Task task : deserializedTasks) {
                System.out.println(task.toString());
            }
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Task class not found");
            c.printStackTrace();
        }
    }
}
