package Arrays;

public class DigitFrequency {
    
    /* while(num>0)
     * find the last digit
     * check whether it equal to n or not
     * if yes count++
     * return count;
     */
    public static void main(String[] args) {
        int num = 11111111;
        int n = 1;
        System.out.println(digitFreq(num , n));
    }

    public static  int digitFreq(int num, int n) {
        int count = 0;
        int r;
        while(num>0){
            r = num%10;
            if(r == n){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
