import java.util.concurrent.Flow.Subscriber;
import java.util.function.ToLongBiFunction;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside are for Triangle");
        return dim1 * dim2 / 2;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fig;
        fig = r;
        System.out.println(fig.area());
        fig = t;
        System.out.println(fig.area());
        fig = f;
        System.out.println(fig.area());
    }
}
