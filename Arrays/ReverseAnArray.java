package Arrays;

// https://practice.geeksforgeeks.org/problems/reverse-a-string/1
public class ReverseAnArray
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        {  
            char ch[]=str.toCharArray();  
            String rev="";  
            for(int i=ch.length-1;i>=0;i--){  
                rev+=ch[i];  
            }  
            return rev;  
        } 
    }
    
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(reverseWord(str));
    }
}