public class main extends SystemFunctions {
    public static void main(String[] args) {

        /*
        // Run the security check, to see if the user is allowed to run the program
        GetConfig config = new GetConfig();
        config.main(new String[]{});
        // Is allowed
        */
        Task task = new Task("Task 1", "This is the first task", "12/12/2023", "Active.");
        System.out.println("Current date: " + getCurrentDate());
        task.getStatus(task);
        task.displayTaskDueDate();
    }
}
