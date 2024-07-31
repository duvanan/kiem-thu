package com.duvanan.kiemthu.phan2;

import org.junit.Assert;
import org.junit.Test;

public class SinhVienTest {
    private SinhVienService sinhVienService = new SinhVienService();

    @Test
    public void testThemSinhVien1() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911")));
    }

    @Test
    public void testThemSinhVien2() {
        Assert.assertTrue(sinhVienService.themSinhVien(null));
    }

    @Test
    public void testThemSinhVien3() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("", "du van an", "lP01", "Kiem Thu", "Ph27911")));
    }


    @Test
    public void testThemSinhVien4() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "", "lP01", "Kiem Thu", "Ph27911")));
    }


    @Test
    public void testThemSinhVien5() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "du van an", "", "Kiem Thu", "Ph27911")));
    }

    @Test
    public void testThemSinhVien6() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "", "Ph27911")));
    }

    @Test
    public void testThemSinhVien7() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "@#!", "Ph27911")));
    }

    @Test
    public void testThemSinhVien8() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "")));
    }

    @Test
    public void testThemSinhVien9() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien("", "", "", "", "")));
    }

    @Test
    public void testThemSinhVien10() {
        Assert.assertTrue(sinhVienService.themSinhVien(new SinhVien(null, null, null, null, null)));
    }




    @Test
    public void timKiemTheoMaSinhVien1() {
        this.sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911"));
        Assert.assertTrue(this.sinhVienService.timKiemTheoMaSinhVien("Ph27911"));
    }

    @Test
    public void timKiemTheoMaSinhVien2() {
        this.sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911"));
        Assert.assertTrue(this.sinhVienService.timKiemTheoMaSinhVien(null));
    }


    @Test
    public void timKiemTheoMaSinhVien3() {
        this.sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911"));
        Assert.assertFalse(this.sinhVienService.timKiemTheoMaSinhVien("2"));
    }


    @Test
    public void timKiemTheoMaSinhVien4() {
        this.sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27921"));
        Assert.assertTrue(this.sinhVienService.timKiemTheoMaSinhVien("Ph27911"));
    }

    @Test
    public void timKiemTheoMaSinhVien5() {
        this.sinhVienService.themSinhVien(new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911"));
        Assert.assertFalse(this.sinhVienService.timKiemTheoMaSinhVien("Ph2723911"));
    }


}
