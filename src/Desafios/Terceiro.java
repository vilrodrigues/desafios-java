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

    public static boolean isItAnagram(String s1, String s2)
    {
        // If both lenghts are not matching of course it is not an anagram
        if(s1.length() != s2.length())
            return false;
        else
        {
            // Turning the strings into char arrays so we can sort it
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            
            // Sorting here
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // Checking if it is an anagram
            return (Arrays.equals(arr1, arr2));
        }
    }
}
