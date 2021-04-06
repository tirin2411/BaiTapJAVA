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
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[],n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        n = sc.nextInt();
        
        a = new int[n];
        nhap(a);
        System.out.println("Cac so vua nhap: ");
        xuat(a);
        System.out.println("Cac so nguyen to trong mang vua nhap: ");
        xuatsonguyento(a);
        System.out.println("\nSo lon nhat: "+ solonnhat(a));
        
        System.out.println("Dem cac so chinh phuong: "+demsochinhphuong(a));
        System.out.println("Mang sap xep tang: ");
        xuatsapxep(a);
    }
    public static void nhap(int a[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<a.length;i++)
            a[i] = scanner.nextInt();
 
    }
    public static void xuat(int a[]){
        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); 
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
    public static void xuatsonguyento(int a[]){
    for (int i=0; i<a.length;i++){
        if(ktsonguyento (a[i])){
            System.out.print(a[i]);
        }
        System.out.print(" ");
        }
    }
    public static int solonnhat(int a[]){
        int max = a[0];
        for (int i=1; i<a.length;i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static boolean ktsochinhphuong(int n) {
        int temp = (int)Math.sqrt(n);
        if(temp*temp == n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int demsochinhphuong(int a[]){
        int dem =0;
        for (int i=0; i<a.length;i++){
            if(ktsochinhphuong (a[i])){
                dem++;
            }
            System.out.print(" ");
        }
        return dem;
    }
    public static void sapxeptang(int a[]){
        for (int i =0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void xuatsapxep(int a[]){
        for (int i=0; i<a.length;i++){
            sapxeptang(a);
            System.out.print(a[i] + " ");

        }
    }
}
