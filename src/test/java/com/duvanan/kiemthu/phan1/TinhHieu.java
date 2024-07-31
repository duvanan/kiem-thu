package com.duvanan.kiemthu.phan1;

import org.junit.Assert;
import org.junit.Test;

public class TinhHieu {

    private int tinhHieu(int a, int b) {
        return a - b;
    }

    @Test
    public void tinhHieu1() {
        Assert.assertEquals(4, this.tinhHieu(2,2));
    }

    @Test
    public void tinhHieu2() {
        Assert.assertEquals(1, this.tinhHieu(3,2));
    }

    @Test
    public void tinhHieu3() {
        Assert.assertEquals(-4, this.tinhHieu(-2,2));
    }

    @Test
    public void tinhHieu4() {
        Assert.assertEquals(0, this.tinhHieu(-2,2));
    }

    @Test
    public void tinhHieu5() {
        Assert.assertEquals(4, this.tinhHieu(-2,-2));
    }

    @Test
    public void tinhHieu6() {
        Assert.assertEquals(0, this.tinhHieu(2,-2));
    }

    @Test
    public void tinhHieu7() {
        Assert.assertEquals(4, this.tinhHieu(2,6));
    }

    @Test
    public void tinhHieu8() {
        Assert.assertEquals(-3, this.tinhHieu(5,2));
    }

    @Test
    public void tinhHieu9() {
        Assert.assertEquals(-1, this.tinhHieu(2,5));
    }

    @Test
    public void tinhHieu10() {
        Assert.assertEquals(40, this.tinhHieu(2,12));
    }
}
