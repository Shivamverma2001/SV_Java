public class tryCatch {
    // static void subRoutine() {
    //     try {
    //         int d = 0;
    //         int a = 10 / d;
    //         System.out.println("This will not be printed");
    //     } catch (ArithmeticException e) {
    //         System.out.println("Divsion by zero");
    //     }
    //     System.out.println("After catch Statement");
    // }

    public static void main(String[] args) {

        // subRoutine();
       try{
        int a=args.length;
        System.out.println("a = "+a);
        int b=42/a;
        int c[]={1};
        c[42]=99;
       }
       catch (ArithmeticException e) {
           System.out.println("Divide by zero " + e);
       }
       catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Array index obbb "+e);
       }
    System.out.println("After try/catch error");
    }}
