package com.duvanan.kiemthu.phan2;


public class SinhVien {
    private String id;
    private String hoten;
    private String malop;
    private String tenlop;
    private String masv;

    // Constructor không tham số
    public SinhVien() {
    }

    // Constructor với tất cả các tham số
    public SinhVien(String id, String hoten, String malop, String tenlop, String masv) {
        this.id = id;
        this.hoten = hoten;
        this.malop = malop;
        this.tenlop = tenlop;
        this.masv = masv;
    }

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho hoten
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    // Getter và Setter cho malop
    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    // Getter và Setter cho tenlop
    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    // Getter và Setter cho masv
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", hoten='" + hoten + '\'' +
                ", malop='" + malop + '\'' +
                ", tenlop='" + tenlop + '\'' +
                ", masv='" + masv + '\'' +
                '}';
    }
}
