public class Square extends Figure implements Printing{

    double a;

    public Square(double a) {
        if (isValidSquare(a)) {
            this.a = a;
        } else {
            System.out.println("Długość boku kwadratu musi być większa od zera.");
        }
    }
    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    double calculatePerimeter() {
        return 4*a;
    }

    private boolean isValidSquare(double a){
        return a>0;
    }

    @Override
    public void print() {
        if(isValidSquare(a)) {
            System.out.println("---Kwadrat---");
            System.out.println("Bok a: " + a);
            System.out.println("Obwod: " + calculatePerimeter());
            System.out.println("Pole powierzchni: " + calculateArea());
            System.out.println("-------------");
        }
    }
}
