/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class NycService {

    // Tạo ra danh sách
    NguoiYeuCu mangNyc[] = new NguoiYeuCu[5];
    Scanner sc = new Scanner(System.in);

    public NycService() {
    }

    public void nhap() {
        for (int i = 0; i < mangNyc.length; i++) {
            NguoiYeuCu ngy = new NguoiYeuCu();
            System.out.println("Nhập tên:");
            String ten = sc.nextLine();
            ngy.setTen(ten);
            System.out.println("Nhập tuổi:");
            // C1: dung nextInt() và xóa bộ nhớ đệm
            int tuoi = sc.nextInt();
            sc.nextLine();
            // C2: dùng nextLine() và ép kiểu dữ liệu
            tuoi = Integer.parseInt(sc.nextLine());
            ngy.setTuoi(tuoi);
            System.out.println("Nhập số điện thoại:");
            String sdt = sc.nextLine();
            ngy.setSdt(sdt);

            System.out.println("Nhập tên:");
            String ten2 = sc.nextLine();
            System.out.println("Nhập tuổi:");
            // C1: dung nextInt() và xóa bộ nhớ đệm
            int tuoi2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập số điện thoại:");
            String sdt2 = sc.nextLine();
            NguoiYeuCu nyc2 = new NguoiYeuCu(ten2, tuoi2, sdt2);
            nyc2.inThongTin();
        }

    }

    public void tuoiMin() {
        NguoiYeuCu nycMin = mangNyc[0];
        for (int i = 1; i < mangNyc.length; i++) {
            if (nycMin.getTuoi() >= mangNyc[i].getTuoi()) {
                nycMin = mangNyc[i];
            }
        }
        //Hieern thi thong tin ngy cu
        nycMin.inThongTin();
    }

}
