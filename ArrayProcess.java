import java.util.Scanner;
class ArrayProcess{
    private int []arr;
    private int n;
    private int key;
    Scanner sc=new Scanner(System.in);
    public int[] input(int []arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
  /*  public void display(int []arr,int n){
        System.out.println("Array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }*/
    public void LinearSearch(int [] arr,int n,int key){
        int i;
        for(i=0;i<n;i++){
            if(key==arr[i]){
                System.out.println(key+" is present at"+(i+1));
            }
        }
        if(i>n){
            System.out.println("key is not present in the array");
        }
    }
    public int BinarySearch(int []arr,int n,int key){
        int l=0,r=n-1,mid=0;
        mid=(l+r)/2;
        while((l<r)&&(arr[mid]!=key)){
            if(key<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            mid=(l+r)/2;
        }
        if(arr[mid]==key){
            return mid;
       }
        else
        return -1;
    }
    public int[] bubbleSort(int arr[],int n){
        int flag=0,temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            break;
        }
        return arr;
    }
    public void insertionSort(int []arr,int n){
        int temp,i,j;
        for(i=0;i<n;i++){
            temp=arr[i];
            for(j=i-1;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
    public void selectionSort(int []arr,int n){
        int temp,min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    void mergeSort(int[]arr,int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr,lb,mid,ub);
        }
    }
    public void merge(int []arr,int lb,int mid,int ub){
        int i,j,k;
        int n1=mid-lb+1;
        int n2=ub-mid;
        int la[]=new int[n1];
        int ra[]=new int[n2];
        for(i=0;i<n1;i++){
            la[i]=arr[lb+i];
        }
        for(j=0;j<n2;j++){
            ra[j]=arr[mid+j+1];
        }
        i=0;
        j=0;
        k=lb;
        while(i<n1&&j<n2){
            if(la[i]<=ra[j]){
                arr[k]=la[i];
                i++;
                k++;
            }
            else{
                arr[k]=ra[j];
                j++;
                k++;
            }
        }
            while(j<n2){
                arr[k]=ra[j];
                j++;
                k++;
            }
            while(i<n1){
                arr[k]=la[i];
                i++;
                k++;
            }
    }
    public void quickSort(int[]arr,int lb,int ub){
        if(lb<ub){
        int loc=Position(arr,lb,ub);
        quickSort(arr, lb, loc-1);
        quickSort(arr, loc+1, ub);
    }
    }
    public int Position(int []arr,int lb,int ub){
        int temp=0;
        int p=arr[ub];
        int i=lb-1;
        for(int j=lb;j<ub;j++){
            if(arr[j]<=p){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[ub];
        arr[ub]=temp;
        return i+1;
    }
}
