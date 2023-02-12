import java.util.*;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * depth * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double h, double w, double d, double we) {
        super(w, h, d);// call superclass constructor
        weight = we;
        // height = h;
        // width = w;
        // depth = d;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// 2nd Multilevel Inheritance
class Shipment extends BoxWeight {
    double cost;

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class MemberAccessInheritance {
    public static void main(String[] args) {
        // BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
        // BoxWeight b2 = new BoxWeight(2, 3, 4, 0.76);
        // BoxWeight b3 = new BoxWeight();
        // BoxWeight cube = new BoxWeight(3, 2);
        // BoxWeight clone = new BoxWeight(b1);
        // double vol;
        // vol = b1.volume();
        // System.out.println(vol);
        // System.out.println(b1.weight);
        // vol = b2.volume();
        // System.out.println(vol);
        // System.out.println(b2.weight);
        // vol = b3.volume();
        // System.out.println(vol);
        // System.out.println(b3.weight);
        // vol = cube.volume();
        // System.out.println(vol);
        // System.out.println(cube.weight);
        // vol = clone.volume();
        // System.out.println(vol);
        // System.out.println(clone.weight);

        // 2nd
        Shipment s1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment s2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = s1.volume();
        System.out.println(vol);
        System.out.println(s1.weight);
        System.out.println(s1.cost);
        vol = s2.volume();
        System.out.println(vol);
        System.out.println(s2.weight);
        System.out.println(s2.cost);
    }
}
