import java.util.Scanner;

/**
 * Created by lbeier on 1/7/14.
 */
public class Diamond {
    private int lines;
    boolean decrease = true;
    int numberOfLines;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Diamond diamond = new Diamond();

        System.out.println("Enter the number of lines: ");
        diamond.lines = keyboard.nextInt();
        diamond.numberOfLines = 2*diamond.lines - 1;

        for(int j = 1; j <= diamond.numberOfLines; j++) {
            System.out.println(diamond.createLine(j));

        }

    }

    public String createLine(int currentLine) {
        String line = "";
        String blankSpace = " ";
        int sizeOfLines = 2*lines - 1;
        int numberOfBlankSpaces = Math.abs(lines - currentLine);
        int numberOfAsterisks = sizeOfLines - 2*numberOfBlankSpaces;

        for(int j = 0; j < numberOfBlankSpaces; j++) {
            line += blankSpace;
        }

        for(int i = 0; i < numberOfAsterisks; i++) {
            line += "*";
        }

        return line;
    }
}
