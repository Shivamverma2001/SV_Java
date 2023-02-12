public class StringConcatination {
    public static void main(String[] args){
        int x = 3;
int y = 4;
String text1 = "Ganga";
String text2 = "River";
//Date today = null;

String text3 = text1 + text2;

String text4 = text1 + x + text2 + y;

String text5 = x + y + text2;

String text6 = text1 + (text2 + (x + y));

//String text7 = text1 + '-' + today;
System.out.println("text3 "+text3);
System.out.println("text4 "+text4);
System.out.println("text5 "+text5);
System.out.println("text6 "+text6);
//System.out.println("text7 "+text7);

}
}
