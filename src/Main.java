import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Utils util = new Utils();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Utils.printMenu();
        while((userInput = scanner.nextInt()) != Utils.EXIT) {
            //Utils.printMenu();
            switch (userInput) {
                case Utils.TRIANGLE -> {
                    util.createAndPrintTriangle();
                    System.out.println();
                    Utils.printMenu();
                }
                case Utils.SQUARE -> {
                    util.createAndPrintSquare();
                    System.out.println();
                    Utils.printMenu();
                }
                case Utils.CIRCLE -> {
                    util.createAndPrintCircle();
                    System.out.println();
                    Utils.printMenu();
                }
                case Utils.THREE_DIM -> {
                    Utils.threeDimMenu();
                    util.createAndPrintThreeDim();
                    Utils.printMenu();
                }
            }
        }
    }
}