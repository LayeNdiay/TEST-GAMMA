
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wellcom to KataFizzBuzz Game");
        for (int i = 1; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = "FIZZ";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            String verifyContains = has30r5(number);
            if (verifyContains != "") {
                result = has30r5(number);

            } else {
                result = String.valueOf(number);
            }
        }
        return result;
    }

    public static String has30r5(int number) {
        String chaine = String.valueOf(number);
        String result = "";
        if (chaine.contains("3")) {
            result = result + "FIZZ";
        }
        if (chaine.contains("3")) {
            result = result + "Buzz";
        }
        return result;
    }
}