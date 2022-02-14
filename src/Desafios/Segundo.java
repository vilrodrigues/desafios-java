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
public class Segundo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        String senha = scan.nextLine();
        
        if(senha.length() >= 6){
            System.out.println("0");
        } else {
            System.out.println(6 - senha.length());
        }
    }
}
