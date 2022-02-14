/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        int qtdEspaco = n - 1;
        int qtdAsterisco = 1;
        
        for (int i = 0; i < n; i++) { 
            contaEspacos(qtdEspaco);
            qtdEspaco--;
            
            printaAsterisco(qtdAsterisco);
            qtdAsterisco++;
            
            System.out.println();
        }
    }
    
    public static void contaEspacos(int qtdEspaco){
        for (int i = 0; i < qtdEspaco; i++) {
            System.out.print(" ");
        }
    }
    
    public static void printaAsterisco(int qtdAsterisco){
        for (int i = 0; i < qtdAsterisco; i++) {
            System.out.print("*");
        }
    }
}
