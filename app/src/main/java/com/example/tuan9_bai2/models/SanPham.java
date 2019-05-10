package com.example.tuan9_bai2.models;

public class SanPham { 
    private String masp; 
    private String tensp; 
    private String HinhAnh;  

     
    public String toString() { 
        return "masp" + masp + "/n tensp" + tensp; 
    }  

    public String getMasp() { 
        return masp; 
    }  

    public void setMasp(String masp) { 
        this.masp = masp; 
    }  

    public String getTensp() {
         return tensp; }  

    public void setTensp(String tensp) { this.tensp = tensp; }   

    public String getHinhAnh() { return HinhAnh; }  

    public void setHinhAnh(String hinhAnh) { HinhAnh = hinhAnh; } 
}

