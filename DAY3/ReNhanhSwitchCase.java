/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ReNhanhSwitchCase {

    public static void main(String[] args) {
        System.out.println("====MENU====");
        System.out.println("1. Tính tổng");
        System.out.println("2. Đếm số lẻ");
        System.out.println("3. Tính trung bình cộng");
        System.out.println("Nhập chuong trình cần chạy");
        Scanner sc = new Scanner(System.in);
        int chuongTrinh = sc.nextInt();
        switch (chuongTrinh) {
            case 1 -> {
                // tổng tổng từ 1 đến số nhập vào               
                tinhTong();
                break;
            }
            case 2 -> {
                // đếm số lẻ từ 1 đến số nhập vào
                demSoLe();
                break;
            }
            case 3 -> {
                // tính trung bình cộng từ 1 đến số nhập vào
                tbCong();
                break;
            }
            default ->
                System.out.println("Nhập sai");
               
        }
    }
    // tính tổng
    public static void tinhTong() {
        int so = 10;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            tong = tong + i;
            // tong += i;
        }
        System.out.printf("Tổng từ 1 đến %d là %d", so, tong);
    }
    // 
    public static void demSoLe() {}
    
    public static void tbCong() {}

}
