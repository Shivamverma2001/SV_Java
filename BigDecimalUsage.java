import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalUsage{
    public static void main(String[] args){
        MathContext mathContext=new MathContext(3);
        BigDecimal x=new BigDecimal("3.14159265358",mathContext);
        System.out.print(x);
    }
}