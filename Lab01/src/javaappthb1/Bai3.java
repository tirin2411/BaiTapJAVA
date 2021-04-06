/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappthb1;

import java.util.Scanner;
import javaappthb1.SinhVien;

/**
 *
 * @author Administrator
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv= new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        sv.setMssv(sc.nextInt()); sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        sv.setTen(sc.nextLine());
        System.out.println("Nhap tuoi sinh vien: ");
        sv.setTuoi(sc.nextInt());sc.nextLine();
        System.out.println("Nhap nam sinh cua sinh vien: ");
        sv.setNamsinh(sc.nextInt()); sc.nextLine();
        System.out.println("Nhap diem sinh vien: ");
        sv.setDiemtb(sc.nextFloat());

        System.out.println("---Thong tin sinh vien---");
        sv.inSV();
    }
    
}
