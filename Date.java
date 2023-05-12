import java.io.Serializable;
/*
Class to represent Date objects
 */
public class Date implements Serializable {
    private int day;
    private int month;
    private int year;
    SystemFunctions system = new SystemFunctions();
    public Date (int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        this.day = day;
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("Year must be after " + system.getCurrentDate() + " and before 2100");
        }
        this.year = year;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
