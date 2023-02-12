import java.util.Scanner;
public class DynamicArray {
    public static  void main(String[] args){
     System.out.println("Enter the size of array");
     Scanner ob=new Scanner(System.in);
     int size=ob.nextInt();
     int []a=new int [size];
     System.out.println("Enter the element of an array");
     for(int i=0;i<size;i++){
        a[i]=ob.nextInt();
     }
     for(int ii:a){
        System.out.println(ii);
    }
    }
}
