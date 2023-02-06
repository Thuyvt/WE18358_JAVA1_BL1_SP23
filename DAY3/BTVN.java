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
public class BTVN {
    public static void main(String[] args) {
        // Nhập họ tên, số nhà, tên đường, tên phường, tên thành phố
        String ten, duong, phuong, thanhPho;
        int soNha;
        System.out.println("Nhập tên:");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.println("Nhập số nhà:");
//        soNha = sc.nextInt();
//        // C1: Xóa dữ liệu dư thừa bằng cách gọi nextLine();
//        sc.nextLine();
        // C2: Thực hiển đổi chuỗi ký tự -> số nguyên
        try {
            soNha = Integer.parseInt(sc.nextLine());
            System.out.println("123 456");
            
        } catch(Exception ex) {
            System.out.println("Nhập sai định dạng số");
            System.out.println(ex.getMessage());
            soNha = 12;
        }
        System.out.println("Nhập tên đường:");
        duong = sc.nextLine();
        System.out.println("Nhập tên phường:");
        phuong = sc.nextLine();
        System.out.println("Nhập tên thành phố:");
        thanhPho = sc.nextLine();
        System.out.println("Tên tôi là " + ten);
        System.out.printf("Địa chỉ: %d, %s, %s, %s \n", soNha, duong, phuong, thanhPho);
    }
    
}
