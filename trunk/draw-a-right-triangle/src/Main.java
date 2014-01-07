import java.util.Scanner;

/**
 * Created by lbeier on 1/7/14.
 */
public class Main {
    public static void main(String[] args) {
        int myint;
        int i;
        String line = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        myint = keyboard.nextInt();

        for(i = 1; i <= myint; i++) {
            line += "*";
            System.out.println(line);
        }
    }
}
