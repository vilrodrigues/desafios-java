package Desafios;

import java.util.Scanner;

/**
 *
 * @author Vilson
 */
public class Primeiro {
    
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
    
    public static void coutingSpaces(int qtdEspaco){
        for (int i = 0; i < qtdEspaco; i++) {
            System.out.print(" ");
        }
    }
    
    public static void printsAsterisk(int qtdAsterisco){
        for (int i = 0; i < qtdAsterisco; i++) {
            System.out.print("*");
        }
    }
}
