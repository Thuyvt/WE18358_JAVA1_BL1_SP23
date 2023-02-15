/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QuanLyNhanVien {

    // Tao danh sach doi tuong nhan vien
    List<NhanVien> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        int nhapNua;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap luong:");
            int luong = Integer.parseInt(sc.nextLine());
            NhanVien nv = new NhanVien(ten, ma, luong);
            arr.add(nv);
            System.out.println("Co nhap nua khong 1-co, 0-khong:");
            nhapNua = Integer.parseInt(sc.nextLine());

        } while (nhapNua == 1);
    }

    public void xuat() { 
        for (NhanVien nv : arr) {
            nv.inThongTin();
        }
    }

    public void xoa() {
        System.out.println("Nhap ma nhan vien can xoa:");
        String ma = sc.nextLine();
        int viTri = getIndex(ma);
        if (viTri == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            // thuc hien xoa = index
            arr.remove(viTri);
            System.out.println("Da xoa thanh cong !!!");
        }
    }

    public void tim() {
        System.out.println("Nhap ma nhan vien can tim:");
        String ma = sc.nextLine();
        int viTri = getIndex(ma);
        if (viTri == -1) {
            System.out.println("Khong tim thay nhan vien");
        } else {
            System.out.println("Thong tin doi tuong can tim la:");
            arr.get(viTri).inThongTin();
        }
    }
    
    public int getIndex(String maNv) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMaNV().trim().equalsIgnoreCase(maNv.trim())) {
                return i;
            }
        }
        return -1;
    }
    
    public void timTrongKhoang() {
        System.out.println("Nhap khoang luong bat dau:");
        int luongbd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap khoan luong ket thuc:");
        int luongkt = Integer.parseInt(sc.nextLine());
        for (NhanVien nv : arr) {
            if (luongbd <= nv.tinhLuong() && nv.tinhLuong() <= luongkt) {
                nv.inThongTin();
            }
        }
    }
    
    public void keThua() {
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap luong:");
        int luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ca:");
        int ca = Integer.parseInt(sc.nextLine());
        NhanVien nv = new BaoVe(ca, ten, ma, luong);
        nv.inThongTin();
        System.out.println("Luong doi tuong bv nay la " + nv.tinhLuong());
    }
    
    public void sapXep() {
        //C1
        System.out.println("Danh sach truoc sap xep");
        xuat();
        // Sap xep danh sach
        Collections.sort(arr);
        // Hien thi laij danh sach sau sap xep
        System.out.println("Danh sach sau sap xep");
        xuat();
        // C2 dung list thay vi arrayList
        List<NhanVien> sort = arr.stream().sorted(Comparator.comparing(NhanVien::getLuong).reversed()).collect(Collectors.toList());
        for (NhanVien item : sort) {
            item.inThongTin();
        }
    }
}
