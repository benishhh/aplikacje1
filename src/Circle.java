public class Circle extends Figure implements Printing {

    double r;

    public Circle(double r) {
        if (isValidCircle(r)) {
            this.r = r;
        } else {
            System.out.println("Promień koła musi być większy od zera.");
        }
    }

    @Override
    double calculateArea() {
        return PI*r*r;
    }

    @Override
    double calculatePerimeter() {
        return 2*PI*r;
    }

    private boolean isValidCircle(double r){
        return r>0;
    }


    @Override
    public void print() {
        if(isValidCircle(r)) {
            System.out.println("---Kolo---");
            System.out.println("Promien: " + r);
            System.out.println("Obwod: " + calculatePerimeter());
            System.out.println("Pole powierzchni: " + calculateArea());
            System.out.println("-------------");
        }
    }
}
