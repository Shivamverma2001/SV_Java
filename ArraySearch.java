import java.util.Scanner;
public class ArraySearch{
    public void display(int []arr,int n){
        System.out.println("Array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }}
    //It is use ArrayProcess.java File
    public static void main(String[] args){
        int l,key;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        l=ob.nextInt();
        int a[]=new int[l];
        //To access array
        System.out.println("Enter the inputs of the array");
        ArrayProcess p=new ArrayProcess();
        a=p.input(a, l);
        //To display array

        ArraySearch as=new ArraySearch();
        as.display(a, l);
        //p.display(na,l);   /for ArraySearch.java
        
        //To display Linear Search
        System.out.println("Enter the key element you want to search by Linear Search");
        key=ob.nextInt();
        p.LinearSearch(a,l,key);

        //Binary Search
        int c;
        System.out.println("Enter the key element you want to search by Binary Search");
        key=ob.nextInt();
        c=p.BinarySearch(a,l,key);
        if(c<0)
        System.out.println(key+" is not present in the array");
        else
        System.out.println(key+" is present int the array at "+(c+1));

        //Bubble Sort
        int n=0;
        System.out.println("Enter the number of element in the array");
        n=ob.nextInt();
        a=new int[n];
        System.out.println("Enter the element of the array");
        a=p.input(a, n);
        System.out.println("After Bubble Sort your array is");
        a=p.bubbleSort(a, n);
        as.display(a, n);

        //Insertion Sort
        n=0;
        System.out.println("Enter the number of element in the array");
        n=ob.nextInt();
        a=new int[n];
        System.out.println("Enter the element of the array");
        a=p.input(a, n);
        System.out.println("After Insertion Sort your array is");
        p.insertionSort(a, n);
        as.display(a, n);

        //Selection Sort
        n=0;
        System.out.println("Enter the number of element in the array");
        n=ob.nextInt();
        a=new int[n];
        System.out.println("Enter the element of the array");
        a=p.input(a, n);
        System.out.println("After Selection Sort your array is");
        p.selectionSort(a, n);
        as.display(a, n);

        //Merge Sort
        n=0;
        System.out.println("Enter the number of element in the array");
        n=ob.nextInt();
        a=new int[n];
        System.out.println("Enter the element of the array");
        a=p.input(a, n);
        System.out.println("After Merge Sort your array is");
        p.mergeSort(a,0, n-1);
        as.display(a, n);

        //Quick Sort
        n=0;
        System.out.println("Enter the number of element in the array");
        n=ob.nextInt();
        a=new int[n];
        System.out.println("Enter the element of the array");
        a=p.input(a, n);
        System.out.println("After Quick Sort your array is");
        p.quickSort(a,0, n-1);
        as.display(a, n);
    }
}