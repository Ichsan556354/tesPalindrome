/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskinterviewichsan;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class tesPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tes KATA PALINDROME");
        System.out.print("Masukkan sebuah Kata: ");
        String kata = input.nextLine();
        
        if (tesPalindrome(kata)) {
            System.out.println("Kata '" + kata +"' adalah kata palindrome!");
        } else {
            System.out.println("Kata '" + kata + "' bukan palindrome");
        }
    }
     
    public static boolean tesPalindrome(String tesKata) {
        tesKata = tesKata.replaceAll(tesKata, tesKata).toLowerCase();
        int range = tesKata.length();
        
        for (int i = 0; i < range / 2; i++) {
            if (tesKata.charAt(i) != tesKata.charAt(range - i - 1)) {
                return false;
            }
        }
        return true;
        
    }
     
}
