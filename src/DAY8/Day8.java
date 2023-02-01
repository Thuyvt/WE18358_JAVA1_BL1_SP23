/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

/**
 *
 * @author ThuyVT
 */
public class Day8 {
    
    public static void main(String[] args) {
        // Khởi tạo đối tượng trước khi sử dụng
//        SinhVien sv1 = new SinhVien();
//        sv1.ten = "thuy";
//        sv1.tuoi = 18;
//        sv1.diem = 7.5;
//        System.out.println("Tên sinh vien là " + sv1.ten);
//        System.out.println("Tuổi sinh viên là " + sv1.tuoi);
//        Sysntem.out.println("Điểm sinh viên là " + sv1.diem);
//        
//        SinhVien sv2 = new SinhVien();
//        sv2.ten = "luong";
//        sv2.tuoi = 18;
//        sv2.diem = 20;
//        System.out.println("Tên sinh vien là " + sv2.ten);
//        System.out.println("Tuổi sinh viên là " + sv2.tuoi);
//        System.out.println("Điểm sinh viên là " + sv2.diem);
        SinhVien sv1 = new SinhVien();
        sv1.setTen("thuy");
        sv1.setDiem(6.5);
        System.out.println("Tên sinh vien là " + sv1.getTen());
        System.out.println("Điểm sinh viên là " + sv1.getDiem());
        
        SinhVien sv2 = new SinhVien();
        sv2.nhap();
        sv2.xuat();
        sv2.an();
        
        for (int i = 0; i < 10; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            sv.xuat();
            sv.an();
        }
        
    }
    
}
