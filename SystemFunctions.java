import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
Class to bring together all the system functions
 */
public class SystemFunctions implements Serializable {
    public static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        return formattedDate;
    }
}
