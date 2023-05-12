import java.util.Calendar;
public class main extends SystemFunctions {
    public static void main(String[] args) {
        /*
        // Run the security check, to see if the user is allowed to run the program
        GetConfig config = new GetConfig();
        config.main(new String[]{});
        // Is allowed
        */
        Task task1 = new Task("Task 1", "This is the first task", "12/12/2023", "Active");
        Task task2 = new Task("Task 2", "This is the second task", "12/12/2023", "Active");
        Task task3 = new Task("Task 3", "This is the third task", "12/12/2023", "Active");
        Task task4 = new Task("Task 4", "This is the fourth task", "12/12/2023", "Active");
        Task task5 = new Task("Task 5", "This is the fifth task", "12/12/2023", "Active");

        System.out.println("Current date: " + getCurrentDate());
        task1.getStatus();
        task1.displayTaskDueDate();
        Calendar c = Calendar.getInstance();
        System.out.println("The current date is: " + c.getTime());
        TaskManager tm = new TaskManager();
        tm.add(task1);
        tm.add(task2);
        tm.add(task3);
        tm.add(task4);
        tm.add(task5);
        tm.displayIDs();
    }
}
