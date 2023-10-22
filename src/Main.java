import java.util.Scanner;

public class Main {

    final static int EXIT = 0;
    final static int TRIANGLE = 1;
    final static int SQUARE = 2;
    final static int CIRCLE = 3;
    final static int THREE_DIM = 4;

    static void printMenu(){
        System.out.println("Wybierz figure: ");
        System.out.println(TRIANGLE + " - TROJKAT");
        System.out.println(SQUARE + " - KWADRAT");
        System.out.println(CIRCLE+ " - KOLO");
        System.out.println(THREE_DIM + " - GRANIASTOSLUP");
        System.out.println(EXIT + " - Wyjscie");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        printMenu();
        while((userInput = scanner.nextInt()) != EXIT) {
            switch (userInput){
                case TRIANGLE: {
                    double a,b,c;
                    System.out.println("Podaj dlugosci bokow trojkata: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    c = scanner.nextDouble();
                    Printing triangle = new Triangle(a,b,c);
                    triangle.print();
                    System.out.println();
                    printMenu();
                    break;
                } case SQUARE: {
                    System.out.println("Podaj dlugosc boku kwadratu: ");
                    double a = scanner.nextDouble();
                    Printing square = new Square(a);
                    square.print();
                    System.out.println();
                    printMenu();
                    break;
                } case CIRCLE: {
                    System.out.println("Podal dlugosc promienia: ");
                    double r = scanner.nextDouble();
                    Printing circle = new Circle(r);
                    circle.print();
                    System.out.println();
                    printMenu();
                } case THREE_DIM: {
                    System.out.println("\nPodaj podstawe graniastoslupa: ");
                    System.out.println(TRIANGLE + " - TROJKAT");
                    System.out.println(SQUARE + " - KWADRAT");
                    System.out.println(CIRCLE+ " - KOLO");
                    int choice = scanner.nextInt();
                    Figure baseThreeDim;
                    if(choice == TRIANGLE){
                        double a,b,c;
                        System.out.println("Podaj dlugosci bokow trojkata: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        c = scanner.nextDouble();
                        baseThreeDim = new Triangle(a,b,c);
                    } else if(choice == SQUARE){
                        System.out.println("Podaj dlugosc boku kwadratu: ");
                        double a = scanner.nextDouble();
                        baseThreeDim = new Square(a);
                    } else if(choice == CIRCLE){
                        System.out.println("Podal dlugosc promienia: ");
                        double r = scanner.nextDouble();
                        baseThreeDim = new Circle(r);
                    } else {
                        System.out.println("Podaj poprawna opcje!");
                        break;
                    }
                    System.out.println("Podaj wysokosc graniastoslupa: ");
                    double height = scanner.nextDouble();
                    ThreeDim threeDim = new ThreeDim(baseThreeDim, height);
                    threeDim.print();
                    printMenu();
                    break;
                }
            }
        }



    }
}