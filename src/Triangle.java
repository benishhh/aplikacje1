public class Triangle extends Figure implements Printing {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {

        if(isValidTriangle(a,b,c)){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Podane długości boków nie tworzą trójkąta");
        }

    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter()/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double calculatePerimeter() {
        return a+b+c;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public void print() {
        if(isValidTriangle(a,b,c)) {
            System.out.println("---Trojkat---");
            System.out.println("Bok a: " + a);
            System.out.println("Bok b: " + b);
            System.out.println("Bok c: " + c);
            System.out.println("Obwod: " + calculatePerimeter());
            System.out.println("Pole powierzchni: " + calculateArea());
            System.out.println("-------------");
        }
    }
}
