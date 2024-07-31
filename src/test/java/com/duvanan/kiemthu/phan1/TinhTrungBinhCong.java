package com.duvanan.kiemthu.phan1;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;

public class TinhTrungBinhCong {

    private Double tinhTrungBinhCong(int[] arr) {
        if (ObjectUtils.isEmpty(arr)) {
            throw new IllegalArgumentException("Mang khong dc de trong");
        }
        return Arrays.stream(arr).average().orElseThrow();
    }

    @Test
    public void tinhTrungBinhCong1() {
        int[] arr = {1,2,3,4,5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong2() {
        int[] arr = {1,2,3,4,5};
        Assert.assertEquals(4, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong3() {
        int[] arr = {};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }


    @Test
    public void tinhTrungBinhCong4() {
        int[] arr = null;
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong5() {
        int[] arr = {1,2,3,4,-5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong6() {
        int[] arr = {1,2,-3,4,5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong7() {
        int[] arr = {1,2,3,-4,5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong8() {
        int[] arr = {-1,-2,-3,-4,-5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong9() {
        int[] arr = {1,-2,3,4,5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }

    @Test
    public void tinhTrungBinhCong10() {
        int[] arr = {-1,2,3,4,5};
        Assert.assertEquals(3, this.tinhTrungBinhCong(arr), 0.0001);
    }
}
