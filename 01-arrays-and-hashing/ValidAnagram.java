import java.util.*;
public class ValidAnagram
{
        
    public static boolean isAnagram(String s, String t) 
    {
        char arr[] = s.toCharArray();
        char brr[] = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        String s1 = new String(arr);
        String s2 = new String(brr);
        return(s1.equals(s2));    
    }

    public static void main(String[]args)
    {
        System.out.println(isAnagram("anagram" , "managra" ));
    }

}