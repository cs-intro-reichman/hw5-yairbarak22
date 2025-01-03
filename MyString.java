/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        System.out.println(randomStringOfLetters(5));
        System.out.println(randomStringOfLetters(8));
        //// Put your other tests here.
    }

    public static int countChar(String str, char ch) {
        int sum = 0;
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == ch) sum++;
        }
        return sum;
    }

    public static boolean subsetOf(String str1, String str2) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] rankstr2 = new int[26];
        int[] rankstr1 = new int[26];
        for (int i = 0; i < 26; i++) {
            rankstr2[i] = countChar(str2, (char) letters[i]);
            rankstr1[i] = countChar(str1, (char) letters[i]);      
        }
        for(int j=0; j<26 ; j++){
        if (rankstr2[j] < rankstr1[j]) {
            return false;
        } 
    }
return true;
    }

    public static String spacedString(String str) {
        String newstr = "";
        for (int i=0; i < str.length() ; i++) {
            if ( i != str.length()-1) newstr += str.charAt(i) + " ";
            else newstr += str.charAt(i);
        }
        return newstr;
    }
  
    public static String randomStringOfLetters(int n) {
        String newstr = "";
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < n; i++) {
            double m = Math.random() * 26;
            newstr += letters[(int) m];
        }
        return newstr;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
    */
    public static String remove(String str1, String str2) {
        char[] stra = new char[str1.length()];
        char[] strb = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) stra[i] = str1.charAt(i);  
        for (int i = 0; i < str2.length(); i++) strb[i] = str2.charAt(i);     
       for (int i = 0; i<str1.length(); i++) {
        for(int j=0; j<str2.length(); j++){
            if (stra[i] == strb[j] && strb[j] != '0') {
                stra[i] = '0';
                strb[j] = '0';
            }
        }
    }
    String newstr = "";
    for (int i=0; i<str1.length(); i++) {
        if(stra[i] != '0') {
            newstr += stra[i];
        }
    }
    return newstr;

        
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
