import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {

    /*
    I would like a constructor, which will create task objects
     */
    private String taskName;
    private String taskDescription;
    private Date taskDueDate;
    private String taskStatus;

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
    }
    public Date getTaskDueDate() {
        return taskDueDate;
    }
    public void displayTaskDueDate() {
        System.out.println("The due date of " + taskName + ": " + taskDueDate.toString());
    }
    public void getStatus(Task task) {
        System.out.println("The status of " + task.taskName + ": " + task.taskStatus);
    }
}