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
public class SinhVienIT extends SinhVienPoly {
    private double java;
    private double html;
    private double css;

    public SinhVienIT() {
    }

    public SinhVienIT(double java, double html, double css, String hoTen, String nganhHoc, double diem) {
        super(hoTen, nganhHoc, diem);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
    
    @Override
    public double getDiemTb() {
        return (this.java *2 + this.css)/3;
    }

    @Override
    public String toString() {
        return "SinhVienIT{" + super.toString() + "java=" + java + ", html=" + html + ", css=" + css + '}';
    }
    
    
}
