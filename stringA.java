//import java.lang.String;
public class stringA {
    public static void main(String[] args){
       // String name1=args[0];
        double marks1=Double.parseDouble(args[0]);
        double marks2=Double.parseDouble(args[1]);
        double marks3=Double.parseDouble(args[2]);
        double total=marks1+marks2+marks3;
        double avg=total/3;
        //System.out.println("Name "+name1);
        System.out.println("Sum "+marks1);
        System.out.println("Sum "+marks2);
        System.out.println("Sum "+marks3);
        System.out.println("Sum "+total);
        System.out.println("Sum "+avg);
        }
}
