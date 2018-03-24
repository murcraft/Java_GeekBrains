import java.math.BigInteger;
import java.sql.SQLOutput;

public class mainData {
    public static void main(String[] args) {

        byte bt = 127;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short sh = 32000;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int i = 2000000000; //4Bytes
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long l = 200000000000000L; //литералы, необходимо указывать L или l
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        char ch = 26545; //можно сюда сохранять числа или символы в одинарных кавычках
        System.out.println(ch);

        String s = "Hello"; //не имеет параметров MAX и MIN
        System.out.println(s);

        boolean b = true;
        System.out.println(b); //не имеет параметров MAX и MIN

        double d = 12.3;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        float f = 12.3f; //литерал, необходимо указывать f или F
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        Void d2 = null;
//      BigDecimal ds;
//      BigInteger bi;
    }
}
