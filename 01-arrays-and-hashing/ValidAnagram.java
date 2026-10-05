import java.util.*;
public class ValidAnagram
{
        
    public static boolean isAnagram(String s, String t) 
    {
        char arr[] = s.toCharArray();
        char brr[] = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        return(Arrays.equals(arr,brr));    
    }

    public static void main(String[]args)
    {
        System.out.println(isAnagram("anagram" , "managra" ));
    }

}