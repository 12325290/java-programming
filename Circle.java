
import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public double area(){
        return  Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return  2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle Props: Radius:" +radius+ ", area:" +area()+ ", circumference:"
                
            +getCircumference() + "";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
    
}
