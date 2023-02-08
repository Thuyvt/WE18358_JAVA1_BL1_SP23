/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLDT service = new QLDT();
        int ct;
//        while (true) {
//            
//        
//        }
        do { 
            System.out.println("===Menu===");
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. Gia max");
            System.out.println("0. Thoat");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    service.nhap();
                    break;
                }
                case 2 -> {
                    service.xuat();
                    break;
                }
                case 3 -> {
                    service.giaMax();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                    break;
                }
                default -> {
                    System.out.println("Nhap sai, nhap lai");
                    break;
                }
            }
        } while (ct != 0) ;
    }
    
}
