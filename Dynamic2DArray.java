import java.util.Scanner;
public class Dynamic2DArray {
    public static  void main(String[] args){
     System.out.println("Enter the size of row");
     Scanner ob=new Scanner(System.in);
     int r=ob.nextInt();
     System.out.println("Enter the size of column");
     int c=ob.nextInt();
     int [][]a=new int [r][c];
     System.out.println("Enter the element of an array");
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++)
        a[i][j]=ob.nextInt();
     }
     for(int[] ii:a){
         for(int aa:ii)
        System.out.println(aa);
    }
    }
}