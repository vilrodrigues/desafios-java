package Desafios;

import java.util.Scanner;

/**
 *
 * @author Vilson
 */
public class Segundo {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        // I'm afraid I have misunderstood this question
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a password: ");
        String pwd = scan.nextLine();
        
        checkPasswordLenght(pwd);
    }
    
    /** Method that checks the given password and returns the number of characters needed to reach the minimum limit.
     *
     * @param passwd - This parameter is the given password to check.
     */
    public static void checkPasswordLenght(String passwd)
    {
        if(passwd.length() >= 6){
            System.out.println("0");
        } else {
            System.out.println(6 - passwd.length());
        }
    }
}
