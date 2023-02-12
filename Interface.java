import java.lang.annotation.Annotation;

interface CallBack {
    void callBack(int param);
}

class Client implements CallBack {
    public void callBack(int p) {
        System.out.println("call back called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}

class AnotherClient implements CallBack {
    public void callBack(int p) {
        System.out.println("Another version of callBack");
        System.out.println("p squared is " + (p * p));
    }
}

public class Interface {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callBack(48);
        c = ob;
        c.callBack(48);
    }
}
