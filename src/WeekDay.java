import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.next();
        switch (weekday) {
            case "1":
                System.out.println("saturday");
                break;
            case "2":
                System.out.println("sunday");
                break;
            case "3":
                System.out.println("monday");
                break;
            case "4":
                System.out.println(" tusday");
                break;
            case "5":
                System.out.println("wednesday");
                break;
            case "6":
                System.out.println("thursday");
                break;
            case "7":
                System.out.println("friday");
                break;
        }
    }
}