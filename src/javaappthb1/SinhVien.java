/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappthb1;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String ten;
    private int mssv;
    private int tuoi;
    private int namsinh;
    private float diemtb;

    public SinhVien() {
       
    }
    public SinhVien(String ten, int mssv, int tuoi, int namsinh, float diemtb) {
        this.ten = ten;
        this.mssv = mssv;
        this.tuoi = tuoi;
        this.namsinh = namsinh;
        this.diemtb = diemtb;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public String getTen() {
        return ten;
    }

    public int getMssv() {
        return mssv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public float getDiemtb() {
        return diemtb;
    }
    public void inSV(){
        System.out.printf("%d %s %d %d %f",mssv,ten,tuoi,namsinh,diemtb);
    }
}
