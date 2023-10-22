import java.util.Scanner;

public class Utils {

    final static int EXIT = 0;
    final static int TRIANGLE = 1;
    final static int SQUARE = 2;
    final static int CIRCLE = 3;
    final static int THREE_DIM = 4;

    Scanner sc = new Scanner(System.in);

    void createAndPrintTriangle(){
        double a,b,c;
        System.out.println("Podaj dlugosci bokow trojkata: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        Printing triangle = new Triangle(a,b,c);
        triangle.print();
    }

    void createAndPrintSquare(){
        System.out.println("Podaj dlugosc boku kwadratu: ");
        double a = sc.nextDouble();
        Printing square = new Square(a);
        square.print();
    }

    void createAndPrintCircle(){
        System.out.println("Podal dlugosc promienia: ");
        double r = sc.nextDouble();
        Printing circle = new Circle(r);
        circle.print();
    }

    void createAndPrintThreeDim(){
        int choice = sc.nextInt();
        Figure baseThreeDim = null;
        if(choice == Utils.TRIANGLE){
            double a,b,c;
            System.out.println("Podaj dlugosci bokow trojkata: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            baseThreeDim = new Triangle(a,b,c);
        } else if(choice == Utils.SQUARE){
            System.out.println("Podaj dlugosc boku kwadratu: ");
            double a = sc.nextDouble();
            baseThreeDim = new Square(a);
        } else if(choice == Utils.CIRCLE){
            System.out.println("Podal dlugosc promienia: ");
            double r = sc.nextDouble();
            baseThreeDim = new Circle(r);
        } else {
            System.out.println("Podaj poprawna opcje!");
        }
        System.out.println("Podaj wysokosc graniastoslupa: ");
        double height = sc.nextDouble();
        ThreeDim threeDim = new ThreeDim(baseThreeDim, height);
        threeDim.print();
    }

}
