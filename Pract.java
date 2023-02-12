public class Pract{
    public static void main(String [] args){
        for(int i=0,j=10;i<88;i++){
           if(i<=j){
               System.out.print(i+" ");
           }
           else{
            System.out.println("");
           }
           if(i>j){
               j=i+10;
           }
        }
    }
}