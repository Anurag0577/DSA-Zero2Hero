package Arrays;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        
    }

    private static int intoDecimal(int num, int type) {
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

    
}
