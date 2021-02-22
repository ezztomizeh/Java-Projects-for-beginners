import java.time.LocalDate;
import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of brith: ");
        int yearOfBrith = scanner.nextInt();
        System.out.println("Enter month of brith: ");
        int monthOfBrith = scanner.nextInt();
        System.out.println("Enter day of brith: ");
        int dayOfBrith = scanner.nextInt();
        LocalDate age = LocalDate.now().minusYears(yearOfBrith).minusMonths(monthOfBrith)
                .minusDays(dayOfBrith);
        System.out.println("your age is : " + age.getYear() + " years and " +
                age.getMonthValue() + " months and " + age.getDayOfMonth() + " days.");
    }
}
