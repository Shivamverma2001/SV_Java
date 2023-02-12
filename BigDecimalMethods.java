import java.math.MathContext;
import java.math.BigDecimal;
public class BigDecimalMethods {
    public static void main(String[] args){
       MathContext mathContext=new MathContext(5);
       BigDecimal x= new BigDecimal("3.145",mathContext);
       BigDecimal y= new BigDecimal("1.792",mathContext);
       //Different Method of BigDecimal
       BigDecimal sum=x.add(y,mathContext);
       BigDecimal difference=x.subtract(y,mathContext);
       BigDecimal product=x.multiply(y,mathContext);
       BigDecimal divide=x.divide(y,mathContext);
       System.out.println("Sum is "+sum);
       System.out.println("Difference is "+difference);
       System.out.println("Product is "+product);
       System.out.println("Divisor is "+divide);
    }
}
