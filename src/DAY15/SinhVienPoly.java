package DAY15;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ThuyVT
 */
public class SinhVienPoly {

    private String hoTen;
    private String nganhHoc;
    private double diem;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganhHoc, double diem) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVienPoly{" + "hoTen=" + hoTen + ", nganhHoc=" + nganhHoc + ", diem=" + diem + '}';
    }

    public void getHocLuc() {
        if (this.diem >= 9 && this.diem <= 10) {
            System.out.println("Hoc luc Xuat sac");
        } else if (this.diem >= 7.5) {
            System.out.println("Hoc luc gioi");
        } else if (this.diem >= 6.5) {
            System.out.println("Hoc luc kha");
        } else if (this.diem >= 5) {
            System.out.println("Hoc luc trung binh");
        } else if (this.diem < 5 && this.diem >= 0) {
            System.out.println("Hoc luc Yeu");
        }
    }
    
    public double getDiemTb() {
        return this.diem;
    }

}
