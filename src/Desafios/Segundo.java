package Desafios;

import java.util.Scanner;

/**
 *
 * @author Vilson
 */
public class Segundo {
    
    public static void main(String[] args) {
        
        // I'm afraid I have misunderstood this question
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a password: ");
        String pwd = scan.nextLine();
        
        if(pwd.length() >= 6){
            System.out.println("0");
        } else {
            System.out.println(6 - pwd.length());
        }
    }
}
