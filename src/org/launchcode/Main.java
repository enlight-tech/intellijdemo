package org.launchcode;

public class Main {
    //Main test
    public static void main(String[] args) {

        //1. Check if all Characters in the string are unique
        String check="yogana";
        boolean value = isUniqueChars(check);


        if(value)
            System.out.println("Alphabets in "+check +" are unique");
        else
            System.out.println("Alphabets in "+check +" contain duplicate");


        //2. Check if one String is permutation of the  other like mad is permutation of dam
        String firstString="dam";
        String secondString="mads";

        boolean checkValue= permutation(firstString, secondString);

        if(checkValue)
            System.out.println("String "+firstString +" is permutation of 2nd String " +secondString);

        else
            System.out.println("String "+firstString +" is Not permutation of 2nd String " +secondString);

    }


    // Check if all Characters in the string are unique
    static boolean isUniqueChars(String str) {
         if (str.length() > 128) return false;

         boolean[] char_set = new boolean[128];
         for (int i= 0; i < str.length(); i++) {
            int val= str.charAt(i);
            if (char_set[val]) {//Already found this char in string
                return false;
            }
            char_set[val] = true;
            }
         return true;
         }

    // Sort String
    static String sort(String s) {
        char[] content= s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
        }

    // Check if one String is permutation of the  other like mad is permutation of dam
    static boolean permutation(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
