public class MainTest {

    public static void main(String[] args) {
        testFizzBuzz();
        testFizz();
        testBuzz();
        testNumber();
    }

    public static void testFizzBuzz() {
        String expectedOutput = "FizzBuzz";
        int number = 15;
        String actualOutput = Main.fizzBuzz(number);
        System.out.println("Test FizzBuzz: " + (expectedOutput.equals(actualOutput) ? "Passed" : "Failed"));
    }

    public static void testFizz() {
        String expectedOutput = "Fizz";
        int number = 9;
        String actualOutput = Main.fizzBuzz(number);
        System.out.println("Test Fizz: " + (expectedOutput.equals(actualOutput) ? "Passed" : "Failed"));
    }

    public static void testBuzz() {
        String expectedOutput = "Buzz";
        int number = 10;
        String actualOutput = Main.fizzBuzz(number);
        System.out.println("Test Buzz: " + (expectedOutput.equals(actualOutput) ? "Passed" : "Failed"));
    }

    public static void testNumber() {
        String expectedOutput = "7";
        int number = 7;
        String actualOutput = Main.fizzBuzz(number);
        System.out.println("Test Number: " + (expectedOutput.equals(actualOutput) ? "Passed" : "Failed"));
    }
}
