import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;

        while (kb.hasNextLine()) {
            input = kb.nextLine();
            Util.printResult(input);
        }
    }
}