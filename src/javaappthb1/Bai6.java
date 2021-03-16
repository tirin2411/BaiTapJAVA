/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappthb1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        
        System.out.printf("Cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (ktsonguyento(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean ktsonguyento(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
