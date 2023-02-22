/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLySinhVien {

    List<SinhVienPoly> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void bai1() {
        int nhapNua = 1;
        do {
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap nganh:");
            String nganh = sc.nextLine();
            System.out.println("Nhap diem");
            double diem = Double.parseDouble(sc.nextLine());
            SinhVienPoly sv = new SinhVienPoly(ten, nganh, diem);
            ds.add(sv);
            System.out.println("Nhap tiep hay khong 1- Co, 0-Khong");
            nhapNua = Integer.parseInt(sc.nextLine());
        } while (nhapNua == 1);
    }

    public void bai2() {
        for (SinhVienPoly sv : ds) {
            System.out.println(sv.toString());
        }
    }

    public void bai3() {
        for (SinhVienPoly sv : ds) {
            if (sv.getDiem() >= 7.5 && sv.getDiem() < 9 && sv.getNganhHoc().equalsIgnoreCase("IT")) {
                System.out.println(sv.toString());
            }
        }
    }

    public void bai4() {
        ds.sort((sv1, sv2) -> (int) (sv2.getDiem() - sv1.getDiem()));
        bai2();
    }

    public void bai5() {
        SinhVienPoly svIT = new SinhVienIT(9, 8, 7, "thuy", "CNTT", 10);
        System.out.println(svIT.toString());
        SinhVienPoly svBiz = new SinhVienBiz(10, 9, "duy", "DIG", 8);
        System.out.println(svBiz.toString());
    }

}
