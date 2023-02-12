public class StringComparison {
    public static void main(String [] args)
    {
        String a="apple";
        String b="APPLE";
        if(a.equals(b))
        {
          System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        if(a.equalsIgnoreCase(b))
        System.out.println("ignore case");
        if(a.compareTo(b)==0)
        System.out.println("a==b");
        if(a.compareTo(b)<0)
        System.out.println("a<b");
        if(a.compareTo(b)>0)
        System.out.println("a>b");
        
    }
}
