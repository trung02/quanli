/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author trunghuynh
 */
public class bao {
    private String idB;
    private String Ngay;
    private String nxb;
    private String so;

    public String getIdB() {
        return idB;
    }

    public String getNgay() {
        return Ngay;
    }

    public String getNxb() {
        return nxb;
    }

    public String getSo() {
        return so;
    }

    


    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    @Override
    public String toString() {
        return "bao{" + "idB=" + idB + ", Ngay=" + Ngay + ", nxb=" + nxb + ", so=" + so + '}';
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public void setSo(String so) {
        this.so = so;
    }

  
    
    
}
