// Convert any base to any base

package Arrays;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int num = 113;
        int sourceType = 8;
        int destinationType = 2;

        int decimal = anyBaseToDecimal(num, sourceType);
        int finalAns = decimalToAnyBase(decimal, destinationType);
        System.out.println(finalAns);
    }

    private static int anyBaseToDecimal(int num, int type) {
        int rv = 0;
        int digit = 0;
        int p = 1;
        while(num>0){
            digit = num % 10;
            num = num / 10;
            rv = rv + digit * p;
            p = p * type;
        }
        return rv;
    }

    private static int decimalToAnyBase(int num, int type) {
        int digit = 0;
        int rv = 0;
        int p = 1;
        while(num> 0 ){
            digit = num%type;
            num = num/type;
            rv = rv + p * digit;
            p = p * 10;
            
        }
        return rv;
    }
}
