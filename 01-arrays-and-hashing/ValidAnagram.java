import java.util.*;
public class ValidAnagram
{
        
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }    
        int c[] = new int[26];
        for(int i = 0 ; i<s.length() ; i++)
        {
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }

        for(int count:c)
        {
            if(count != 0)
            {
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[]args)
    {
        System.out.println(isAnagram("anagram" , "managra" ));
    }

}