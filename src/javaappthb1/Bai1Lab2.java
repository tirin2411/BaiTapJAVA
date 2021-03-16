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
public class Bai1Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap vao so b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap vao so c: ");
        float c = sc.nextFloat();
        giaiPTBac2(a,b,c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem!");
            } else {
                System.out.println("PT co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("PT co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("PT vo nghiem!");
        }
    }
    
}
