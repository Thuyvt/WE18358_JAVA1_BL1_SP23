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
public class ReNhanhIfElse {
    // Nhập điểm trung bình
    // Nếu điểm > 50 : loại trung bình
    // Nếu điểm >= 80: loại khá
    // Nếu điểm >= 90: Giỏi
    public static void main(String[] args) {
        System.out.println("Nhập điểm:");
        Scanner sc = new Scanner(System.in);
        int diem = sc.nextInt();
        // C1: điều kiện xuôi
        if(diem > 50 && diem < 80) {
            System.out.println("Loại trung bình");
        } else if (diem >= 80 && diem < 90) {
            System.out.println("Loại khá");
        } else if (diem >= 90 && diem <= 100) {
            System.out.println("Loại giỏi");
        }
        // C2: điều kiện ngược
        if (diem >= 90) {
            System.out.println("Loại giỏi");
        } else if (diem >= 80) {
            System.out.println("Loại khá");
        } else if (diem > 50) {
            System.out.println("Loại trung bình");
        }
        
    }
    
}
