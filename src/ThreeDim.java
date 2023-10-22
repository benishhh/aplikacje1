public class ThreeDim{

    Figure base;
    double height;

    public ThreeDim(Figure base, double height) {
        if(isValidThreeDim(height)){
            this.base = base;
            this.height = height;
        } else {
            System.out.println("Wysokosc musi byc wieksza od 0.");
        }
    }

    double calculateVolume(){
        return base.calculateArea() * height;
    }

    double calculateArea(){
        return 2*base.calculateArea() + height * base.calculatePerimeter();
    }

    private boolean isValidThreeDim(double height){
        return height>0;
    }

    public void print(){
         if(isValidThreeDim(height)) {
            System.out.println("---Graniastoslup---");
            System.out.println("Wysokosc: " + height);
            System.out.println("Pole powierzchni podstawy: " + base.calculateArea());
            System.out.println("Obwod podstawy: " + base.calculatePerimeter());
             System.out.println("Objetosc graniastoslupa: " + calculateVolume());
             System.out.println("Pole powierzchni graniastoslupa: " + calculateArea());
            System.out.println("-------------");
        }
    }

}
