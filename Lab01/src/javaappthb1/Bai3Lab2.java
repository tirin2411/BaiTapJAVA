/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappthb1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so cot: ");
        int c = sc.nextInt();
        System.out.println("Nhap vao so dong: ");
        int d = sc.nextInt();
        
        int a[][] = new int[c][d];
        random(a,d,c);
        xuat(a,c,d);
    }
    public static void random(int a[][],int d,int c){
        Random rd = new Random(); 
        for (int i=0;i<d;i++){
            for (int j = 0; j < c; j++) {
                a[i][j] = rd.nextInt(50);
            }
        }
 
    }
    public static void xuat(int a[][],int c,int d){
        for (int i=0;i<d;i++){
            for (int j = 0; j < c; j++) {
            System.out.print(a[i][j] + " ");
            }
        }
    }
}
