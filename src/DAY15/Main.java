/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY15;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien ql = new QuanLySinhVien();
        int menu;
        do {
            System.out.println("====Menu====");
            System.out.println("1.  Nhập 1 danh sách đối tượng");
            System.out.println("2.  Xuất danh sách đối tượng đã nhập");
            System.out.println("3.  Xuất danh sách sinh viên IT có học lực giỏi");
            System.out.println("4.  Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5.  ke thua");
            System.out.println("0.  Thoát");
            System.out.println("Nhap chuong trinh can chay");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    ql.bai1();
                    break;
                }
                case 2 -> {
                    ql.bai2();
                    break;
                }
                case 3 -> {
                    ql.bai3();
                    break;
                }
                case 4 -> {
                    ql.bai4();
                    break;
                }
                case 5 -> {
                    ql.bai5();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }

        } while (menu != 0);
    }
}
