import java.io.Serializable;
import java.util.Scanner;
import java.util.UUID;
/*
Class to represent Task objects
 */
public class Task implements Serializable {

    /*
    I would like a constructor, which will create task objects
     */
    private String taskName;
    private String taskDescription;
    private Date taskDueDate;
    private String taskStatus;
    private UUID taskID;

    public Task(String taskName, String taskDescription, String taskDueDate, String taskStatus) {
        Scanner sc = new Scanner(System.in);
        if(taskName.length() < 35) {
            this.taskName = taskName;
        }
        else {
            System.out.println("The task name is too long! Please shorten it.");
            while(taskName.length() > 35) {
                System.out.println("Please enter a new task name: ");
                String newTaskName = sc.nextLine();
                if(newTaskName.length() < 35) {
                    taskName = newTaskName;
                }
            }
        }
        if(taskDescription.length() < 200) {
            this.taskDescription = taskDescription;
        }
        else {
            System.out.println("The task description is too long! Please shorten it.");
            while(taskDescription.length() > 200) {
                System.out.println("Please enter a new task description: ");
                String newTaskDescription = sc.nextLine();
                if(newTaskDescription.length() < 200) {
                    taskDescription = newTaskDescription;
                }
            }
        }
        String[] dateParts = taskDueDate.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        this.taskDueDate = new Date(day, month, year);
        if(taskStatus.equals("Active") || taskStatus.equals("Inactive")) {
            this.taskStatus = taskStatus;
        }
        else {
            System.out.println("The task status is invalid! Please enter either 'Active' or 'Inactive'");
            boolean condition = true;
            while(condition) {
                System.out.println("Please enter a new task status: ");
                String newTaskStatus = sc.nextLine();
                if(newTaskStatus.equals("Active") || newTaskStatus.equals("Inactive")) {
                    this.taskStatus = newTaskStatus;
                    condition = false;
                }
            }
        }
        this.taskID = UUID.randomUUID();
    }
    public String toString() {
        return "Task name: " + taskName + "\nTask description: " + taskDescription + "\nTask due date: " + taskDueDate.toString() + "\nTask status: " + taskStatus;
    }
    public String getTaskName() { return taskName; }
    public String getTaskDescription() { return taskDescription; }
    public Date getTaskDueDate() {
        return taskDueDate;
    }
    public String getTaskStatus() { return taskStatus; }
    public UUID getTaskID() { return taskID; }
    public void displayTaskDueDate() {
        System.out.println("The due date of " + taskName + ": " + taskDueDate.toString());
    }
    public void getStatus() {
        System.out.println("The status of " + taskName + ": " + taskStatus);
    }
}