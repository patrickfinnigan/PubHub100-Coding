package Exceptions;

public class Application {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try {
            runner.run();
        } catch (CustomException e) {
            System.out.println("CustomException caught!");
            e.printStackTrace();
        }

        System.out.println("Program continuing anyway.");
    }
}

// thanks to Russell for sharing the actual code with me. Helped me understand how to read Java a fair bit better than  before!