/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

/**
 *
 * @author ThuyVT
 */
public class ChuyenDoiDuLieu {
    public static void main(String[] args) {
        try {
            String diemToan = "9.5";
            String diemVan = "8.3";
            System.out.println(diemToan + " " + diemVan);
            double dToan = Double.parseDouble(diemToan);
            double dVan = Double.parseDouble(diemVan);
            double diemTb = (dToan + dVan) / 2;
            System.out.println("Điểm trung bình môn là " + diemTb);
            String diemAnh = "8.6L";
            float dAnh = Float.parseFloat(diemAnh);
            System.out.printf("Điểm tiếng anh là %.2f\n", dAnh);
        } catch (Exception ex) {
            System.out.println("Nhập sai định dạng");
        }
    }
}
