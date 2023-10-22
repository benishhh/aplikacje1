import java.util.Scanner;

public class Main {

    static void printMenu(){
        System.out.println("Wybierz figure: ");
        System.out.println(Utils.TRIANGLE + " - TROJKAT");
        System.out.println(Utils.SQUARE + " - KWADRAT");
        System.out.println(Utils.CIRCLE+ " - KOLO");
        System.out.println(Utils.THREE_DIM + " - GRANIASTOSLUP");
        System.out.println(Utils.EXIT + " - Wyjscie");
    }

    static void threeDimMenu(){
        System.out.println("\nPodaj podstawe graniastoslupa: ");
        System.out.println(Utils.TRIANGLE + " - TROJKAT");
        System.out.println(Utils.SQUARE + " - KWADRAT");
        System.out.println(Utils.CIRCLE+ " - KOLO");
    }

    public static void main(String[] args) {

        Utils util = new Utils();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        printMenu();
        while((userInput = scanner.nextInt()) != Utils.EXIT) {
            switch (userInput) {
                case Utils.TRIANGLE -> {
                    util.createAndPrintTriangle();
                    System.out.println();
                    printMenu();
                }
                case Utils.SQUARE -> {
                    util.createAndPrintSquare();
                    System.out.println();
                    printMenu();
                }
                case Utils.CIRCLE -> {
                    util.createAndPrintCircle();
                    System.out.println();
                    printMenu();
                }
                case Utils.THREE_DIM -> {
                    threeDimMenu();
                    util.createAndPrintThreeDim();
                    printMenu();
                }
            }
        }
    }
}