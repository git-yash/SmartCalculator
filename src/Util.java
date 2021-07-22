public class Util {
    private static int[] getNumbers(String text) {
        String[] numbersStringArray = text.split(" ");
        int[] numbers = new int[numbersStringArray.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStringArray[i]);
        }

        return numbers;
    }

    public static void printResult(String input) {
        if (input.equals("/exit")) {
            System.out.println("Bye!");
            System.exit(0);
        } else if (input.equals("/help")) {
            System.out.println("The program calculates the sum of numbers");
        } else {
            try {
                Calculator calculator = new Calculator(getNumbers(input));
                System.out.println(calculator.getSum());
            } catch (Exception e) {
                System.out.println("Invalid expression");
            }
        }
    }
}
