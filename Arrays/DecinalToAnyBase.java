// covert decimal into any base
package Arrays;

public class DecinalToAnyBase {
    public static void main(String[] args) {
       int num = 634;
        int type = 8;
        System.out.println(intoOctal(num, type)); 
    }

    private static int intoOctal(int num, int type) {
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
