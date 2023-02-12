enum Apple {
    Jonathan(10), Golden(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class Enumeration {
    public static void main(String[] args) {
        // Apple ap;
        // ap = Apple.RedDel;
        // System.out.println("Value of ap: " + ap);
        // System.out.println();
        // ap = Apple.Golden;
        // if (ap == Apple.Golden)
        // System.out.println("ap contains Golden.\n");
        // switch (ap) {
        // case Jonathan:
        // System.out.print("Jonathan is red");
        // break;
        // case Golden:
        // System.out.print("Golden is red");
        // break;
        // case RedDel:
        // System.out.print("RedDel is red");
        // break;
        // case Winesap:
        // System.out.print("Winesap is red");
        // break;

        // default:
        // System.out.print("Cortland is red");
        // break;
        // }
        // Apple allApples[] = Apple.values();
        // for (Apple a : allApples)
        // System.out.println(a);
        // ap = Apple.valueOf("Winesap");
        // System.out.println("ap constains " + ap);
        Apple ap;
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");
        System.out.println("All apple pricse");
        for (Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() + " cents");
    }
}
