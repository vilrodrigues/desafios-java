package Desafios;

import java.util.Scanner;

/**
 *
 * @author Vilson
 */
public class Primeiro {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Informe o N: ");
        int n = scan.nextInt();
        
        int numberOfSpaces = n - 1;
        int numberOfAsterisk = 1;
        
        for (int i = 0; i < n; i++) { 
            // As the number of spaces decreases
            coutingSpaces(numberOfSpaces);
            numberOfSpaces--;
            
            // The number of asterisk increases
            printsAsterisk(numberOfAsterisk);
            numberOfAsterisk++;
            
            System.out.println();
        }
    }
    
    /** Method that counts and prints all spaces needed .
     * @param spaces - This parameter is the number of spaces that are going to be printed.
     */
    
    public static void coutingSpaces(int spaces){
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }
    
    /** Method that prints all asterisk needed.
     * @param asterisk - This parameter is the number of asterisk that are going to be printed.
     */
    public static void printsAsterisk(int asterisk){
        for (int i = 0; i < asterisk; i++) {
            System.out.print("*");
        }
    }
}
