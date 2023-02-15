/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

/**
 *
 * @author ThuyVT
 */
public class BaoVe extends NhanVien {
    private int ca;

    public BaoVe() {
    }

    public BaoVe(int ca, String ten, String maNV, int luong) {
        // dai dien doi tuong cha
        super(ten, maNV, luong);
        this.ca = ca;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ca:" + this.ca);
    }
    
    @Override
    public int tinhLuong() {
        return super.tinhLuong()/2;
    }
}
