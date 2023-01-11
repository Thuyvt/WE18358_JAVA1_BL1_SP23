/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class DAY2 {
    public static void main(String[] args) {
        // Hiển thị giá tị họ và tên, năm sinh, số điện thoại
        String ten = "Vũ Thị Thúy";
        int namSinh = 1993;
        String soDienThoai = "0886341201";
        System.out.printf("Tên tôi là %s, tôi sinh năm %d, số điện thoại của tôi là %s\n", 
                ten, namSinh, soDienThoai);
        System.out.println("Tên tôi là " + ten + " tôi sinh năm " + namSinh + " số điện thoại của tôi là " + soDienThoai);
        
        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        // Nhập họ tên, tuổi, số đo 3 vòng của người yêu cũ
        System.out.print("Nhập họ tên người yêu cũ: ");
        // Gọi hàm nextLine() lấy giá trị 1 dòng dữ liệu
        String hoTen = sc.nextLine();
        System.out.print("Nhập tuổi người yêu cũ: ");
        // Gọi hàm nextInt() lấy giá trị nhập vào là 1 số nguyên
        int tuoi = sc.nextInt();
        double vong1, vong2, vong3;
        System.out.println("Nhập vòng 1: ");
        // Gọi hàm nextDouble() lấy giá trị nhập vào là 1 số thực
        vong1 = sc.nextDouble();
        System.out.println("Nhập vòng 2: ");
        // Gọi hàm nextDouble() lấy giá trị nhập vào là 1 số thực
        vong2 = sc.nextDouble();
        System.out.println("Nhập vòng 3: ");
        // Gọi hàm nextDouble() lấy giá trị nhập vào là 1 số thực
        vong3 = sc.nextDouble();
        System.out.printf("Tên người yêu cũ: %s\n", hoTen);
        System.out.printf("Tuổi người yêu cũ: %d\n", tuoi);
        System.out.printf("Số đo 3 vòng: %f %.2f %.3f\n", vong1, vong2, vong3);

    }
    
}
