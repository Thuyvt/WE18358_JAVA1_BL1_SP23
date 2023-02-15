/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        int ct;
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        do {
            System.out.println("====Menu====");
            System.out.println("1. Nhập 1 danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng đã nhập");
            System.out.println("3. Xóa NV theo mã NV nhập vào");
            System.out.println("4. Tìm nhân viên theo mã NV nhập vào");
            System.out.println("5. Xuất danh sách NV theo khoảng lương nhập vào");
            System.out.println("6. Ke thua");
            System.out.println("7. Sap xep");
            System.out.println("0. Thoat");
            System.out.println("Nhap chuong trinh:");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    qlnv.nhap();
                    break;
                }
                case 2 -> {
                    qlnv.xuat();
                    break;
                }
                case 3 -> {
                    qlnv.xoa();
                    break;
                }
                case 4 -> {
                    qlnv.tim();
                    break;
                }
                case 5 -> {
                    qlnv.timTrongKhoang();
                    break;
                }
                case 6 -> {
                    qlnv.keThua();
                    break;
                }
                case 7 -> {
                    qlnv.sapXep();
                    break;
                }
                case 0 -> {
                    break;
                }
            }
        } while (ct != 0);
    }
}
