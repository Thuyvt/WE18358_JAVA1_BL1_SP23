/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class SinhVien {
    // Thuộc tính tên
    private String ten;
    private String email;
    private String soDienThoai;
    private int tuoi;
    private double diem;
    // Lấy giá trị của thuộc tính tên
    public String getTen() {
        return this.ten;
    }
    // Gán giá trị nhập vào
    public void setTen(String ten) {
        this.ten = ten;
    }
    // Lấy giá trị của thuộc tính điểm
    public double getDiem() {
        return this.diem;
    }
    // Gán trị cho điểm
    public void setDiem(double diem) {
        if (diem <0 || diem > 10) {
            System.out.println("Nhập điểm không hợp lệ");
        } else {
            this.diem = diem;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        //C1:
//        String name = sc.nextLine();
//        this.setTen(name);
        // C2
        this.setTen(sc.nextLine());
        System.out.print("Nhập tuổi:");
        this.setTuoi(sc.nextInt());
        System.out.print("Nhập điểm:");
        this.setDiem(sc.nextDouble());
    }
    
    public void xuat() {
        System.out.println("Tên sinh viên là:" + this.getTen());
        System.out.println("Tuổi sinh viên là:" + this.getTuoi());
        System.out.println("Điểm sinh viên là:" + this.getDiem());
        System.out.println("=============");
    }
    
    // Hành động đặc chưng của đối tượng
    void an() {
        System.out.println("Ăn đê !!!!");
    }
}
