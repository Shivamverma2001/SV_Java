public class TypeCasting{
    public static void main(String[] args){
        //int a=45.89f;          //float--->int        Error    Explicit conversion
        int a=(int)45.89f;
        System.out.println(a);    //It show 45
        double b=45;//     Implicit conversion   int to double
        System.out.println(b);
        char q=65;
        System.out.println(q);
    }
}