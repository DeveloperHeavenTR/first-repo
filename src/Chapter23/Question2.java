package Chapter23;

import java.util.Locale;

public class Question2 {
    public static void main(String[] args) {

//remover();
arePresent(new String[]{"areaSFDGH"});
    }

    /*
    Create a method that accepts an array of two strings and checks if the
     letters in the second string are present in the first string.
    */

    public static boolean arePresent(String[] arr1){// [String, String2], String.contains()
        for(int i=0;i<arr1[1].length();i++){
            if(!arr1[0].toLowerCase().contains(Character.toLowerCase(arr1[1].charAt(i))+""))
                return false;
        }
        return true;
    }


    // Write a function that removes any non-letters from a string, returning a well-known film title.
    public static void remover(String str){
        str=str.replaceAll("\\w", "");
        System.out.println(str);
    }







/*
    Create a method that takes a string as an argument and
    converts the first character of each word to uppercase. Return the newly formatted string.
*/
    public static void capitilizer(String str){
        String[] str2 = str.split();

    }
}
