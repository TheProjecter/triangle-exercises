import java.util.Scanner;

/**
 * Created by lbeier on 1/7/14.
 */
public class Main {

    private int lines;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Enter the number of lines: ");
        main.lines = keyboard.nextInt();

        for(int j = 1; j <= main.lines; j++) {
            System.out.println(main.createLine(j));
        }

    }

    public String createLine(int currentLine) {
        String line = "";
        String blankSpace = " ";
        int numberOfAsterisks = 2*currentLine - 1;
        int spaces;

        spaces = lines - currentLine;

        while(spaces > 0) {
            line += blankSpace;
            spaces = spaces - 1;
        }

        for(int i = 0; i < numberOfAsterisks; i++) {
            line += "*";
        }

        return line;
    }
}