import java.util.EnumSet;

public class String_Rotation{
    static boolean areRotation(String s1,String s2){
        return (s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1);
    }
    public static void main(String [] aStrings){
        String str1 = "ABACD";
        String str2 = "CDABA";
        String s3 = "ACBD";
       if(areRotation(str1,str2)){
           System.out.println("Strings are rotations of each other");
       }
       else{
           System.out.println("Strings are not rotations of each other");
       }
       if(areRotation(str1,s3)){
        System.out.println("Strings are rotations of each other");
    }
    else{
        System.out.println("Strings are not rotations of each other");
    }
    }
}