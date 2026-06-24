import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Solution {
    public int dayOfYear(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateObj = LocalDate.parse(date,formatter);
        return dateObj.getDayOfYear();
    }
}