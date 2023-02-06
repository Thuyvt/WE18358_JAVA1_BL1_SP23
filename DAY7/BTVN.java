/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên:");
        int soLuong = sc.nextInt();
        sc.nextLine();
        if (soLuong > 0 ) {
            String sv[] = new String[soLuong];
            double diem[] = new double[soLuong];
            for (int i = 0; i < soLuong; i++) {
                System.out.printf("Nhập tên sinh viên thứ %d", i +1);
                sv[i] = sc.nextLine();
                System.out.printf("Nhập điểm sinh viên thứ %d", i + 1);
                diem[i] = sc.nextDouble();
                sc.nextLine();
            }
            
            System.out.println("Mảng sinh viên:" + Arrays.toString(sv));
            System.out.println("Mảng điểm: " + Arrays.toString(diem));
            
            // Goi ham sap xep
            sort(sv, diem);
            // xep loai
            for (int i = 0; i < soLuong; i++) {
                System.out.println("Họ tên: " + sv[i]);
                System.out.println("Điểm: " + diem[i]);
                if (diem[i] >=9 ){
                    System.out.println("Xuất sắc");
                } else if (diem[i] >= 7.5) {
                    System.out.println("Giỏi");
                } else if (diem[i] >= 6.5) {
                    System.out.println("Khá");
                } else if (diem[i] >= 5) {
                    System.out.println("Trung bình");
                }
            }
            
        } else  {
            System.out.println("Nhập sai số lượng");
        }
    }
    
    public static void sort(String mangSv[], double mangDiem[]) {
        for (int i = 0; i < mangSv.length ; i++) {
            for (int j = i + 1; j < mangSv.length ; j++) {
                if (mangDiem[i] > mangDiem[j]) {
                    double diem = mangDiem[i];
                    mangDiem[i] = mangDiem[j];
                    mangDiem[j] = diem;
                    
                    String ten = mangSv[i];
                    mangSv[i] = mangSv[j];
                    mangSv[j] = ten;
                    
                }
            }
        }
    
    }
}
