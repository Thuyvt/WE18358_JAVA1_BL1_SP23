/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY15;

/**
 *
 * @author ThuyVT
 */
public class SinhVienBiz extends SinhVienPoly{
    private double marketing;
    private double sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double marketing, double sales, String hoTen, String nganhHoc, double diem) {
        super(hoTen, nganhHoc, diem);
        this.marketing = marketing;
        this.sales = sales;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
    @Override
    public double getDiemTb() {
        return (2 * this.marketing + this.sales)/3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + super.toString() + "marketing=" + marketing + ", sales=" + sales + '}';
    }
    
    
}
