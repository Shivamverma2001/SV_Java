import java.util.Scanner;
public class InputTaking{
    public static void main(String [] args){
     int a,b;
     Scanner ob=new Scanner(System.in);//System.in   use for taking input from user
     System.out.println("Enter value of a");
     //nextInt,nextFloat....
     a=ob.nextInt();//by this we take int value and store in a
     System.out.println("Enter value of b");
     b=ob.nextInt();
     System.out.println("sum is"+(a+b));
    }
}