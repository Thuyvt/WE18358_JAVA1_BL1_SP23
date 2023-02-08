/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QLDT {
    Scanner sc = new Scanner(System.in);
    DienThoai mangDienThoai[];
    int sl;

    public QLDT() {
    }
    // Nhap thong tin
    public void nhap() {
        System.out.println("Nhap so luong dien thoai:");
        sl = Integer.parseInt(sc.nextLine());
        mangDienThoai = new DienThoai[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap thuong hieu:");
            String thuongHieu = sc.nextLine();
            System.out.println("Nhap gia:");
            double gia = Double.parseDouble(sc.nextLine());
            // Tao doi tuong tu gia tri nhap vao
            DienThoai dt = new DienThoai(ma, ten, thuongHieu, gia);
            // Gan dôi tuong vao vi tri cua mang
            mangDienThoai[i] = dt;
            
        }
    }
    // Xuat gia tri
    public void xuat() {
        for (int i = 0; i < mangDienThoai.length; i++) {
            DienThoai dt = mangDienThoai[i];
            dt.inThongTin();
            // Hien thi dat re
            if (dt.getGia() > 50000000) {
                System.out.println("Đắt");
            } else {
                System.out.println("Rẻ");
            }
        }
    }
    // Dien Thoai gia max
    public void giaMax() {
        DienThoai max = mangDienThoai[0];
        for (int i = 0; i < sl; i++) {
            if (max.getGia() < mangDienThoai[i].getGia()) {
                max = mangDienThoai[i];
            }
        }
        max.inThongTin();
    }
}
