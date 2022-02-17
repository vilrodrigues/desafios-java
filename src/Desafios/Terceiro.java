package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Vilson
 */
public class Terceiro 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = scan.nextLine(); // Getting the String
        word = word.toLowerCase().replaceAll("\\s", ""); // Puts it to a default case and getting rid of blank spaces
        
        int anagramsFound = 0; // Anagrams counter
        
        ArrayList<String> seekAnagram = new ArrayList<>(); // For dynamic index
        
        seekAnagram = breakWord(word); // Break it
        
        // Calling the isItAnagram method for each iteration
        for (int i = 0; i < seekAnagram.size(); i++) {
            for (int j = i + 1; j < seekAnagram.size(); j++) {
                if(isItAnagram(seekAnagram.get(i), seekAnagram.get(j))){
                    anagramsFound += 1;
                }
            }
        }
        System.out.println(anagramsFound);
    }
    
    /**
     *
     * @param breakThisWord - Given String to break into groups of characters.
     * @return An arrayList that contains in it's indexes the given String separated into groups of characters.
     */
    public static ArrayList<String> breakWord(String breakThisWord)
    {
        ArrayList<String> brokenWord = new ArrayList<>();
        
        // Breaking the string by substring groups
        for(int i = 1; i < breakThisWord.length(); i++) {
            for(int j = 0; j <= breakThisWord.length() - i; j++) {
                brokenWord.add(breakThisWord.substring(j, j + i));
            }
        }
        return brokenWord;
    }

    /**
     *
     * @param str1 - A String to compare to the second parameter.
     * @param str2 - A String to compare to the first parameter.
     * @return If the given two parameters are anagrams, the return is true, else returns false.
     */
    public static boolean isItAnagram(String str1, String str2)
    {
        // If both lenghts are not matching of course it is not an anagram
        if(str1.length() != str2.length())
            return false;
        else
        {
            // Turning the strings into char arrays so we can sort it
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            
            // Sorting here
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            
            // Checking if it is an anagram
            return (Arrays.equals(str1CharArray, str2CharArray));
        }
    }
}
