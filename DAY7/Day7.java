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
public class Day7 {

    public static void main(String[] args) {
        int mangSo[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị cho mảng
        for (int index = 0; index < mangSo.length; index++) {
            System.out.printf("Nhap phan tu thu %d: ", (index + 1));
            mangSo[index] = sc.nextInt();
        }
        // Hiển thị giá trị của mảng
        System.out.println("Phan tu mang: " + Arrays.toString(mangSo));

        // Sắp xếp tăng
        Arrays.sort(mangSo);

        System.out.println("Phan tu mang sau sap xep:" + Arrays.toString(mangSo));

        // Tìm số nhỏ nhất trong mảng
        int min = mangSo[0];
        for (int i = 1; i < mangSo.length; i++) {
            // C1
            if (min > mangSo[i]) {
                min = mangSo[i];
            }
            // C2
            min = Math.min(min, mangSo[i]);
        }
        System.out.println("Gia tri nho nhat cua mang la: " + min);
        
        int sum = 0, count = 0;
        for (int i = 0; i < mangSo.length; i++) {
            if (mangSo[i] % 3 == 0) {
                sum += mangSo[i];
                count++;
            }
        }
        float avg = (float) sum/count;
        System.out.println("Gia tri trung binh cac so chia het cho 3:" + avg);
        
        // Trả về giá trị là vị trí của phần tử cần tìm
        int i = Arrays.binarySearch(mangSo, 9);
        System.out.println("Vi tri cua so 9 la " + i);
        
        // Chèn giá trị và tất cả các vị trí trong mảng
        Arrays.fill(mangSo, 7);
        System.out.println("Gia tri sau khi fill:" + Arrays.toString(mangSo));
    }
}
