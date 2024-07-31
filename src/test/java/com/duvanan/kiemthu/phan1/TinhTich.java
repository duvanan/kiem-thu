package com.duvanan.kiemthu.phan1;

import org.junit.Assert;
import org.junit.Test;

public class TinhTich {
    //Sử dụng các kỹ thuật biên, phân vùng tương đương viết 10 test case để thực hiện chức năng tính tích của 2 số nguyên.
    // Kiểm tra 2 số nhập vào có phải là số nguyên hay không ?

    private int tinhTich(int a, int b) {
        return a * b;
    }

    @Test
    public void tinhTich1() {
        Assert.assertEquals(4, this.tinhTich(2,2));
    }

    @Test
    public void tinhTich2() {
        Assert.assertEquals(4, this.tinhTich(3,2));
    }

    @Test
    public void tinhTich3() {
        Assert.assertEquals(-4, this.tinhTich(-2,2));
    }

    @Test
    public void tinhTich4() {
        Assert.assertEquals(4, this.tinhTich(-2,2));
    }

    @Test
    public void tinhTich5() {
        Assert.assertEquals(4, this.tinhTich(-2,-2));
    }

    @Test
    public void tinhTich6() {
        Assert.assertEquals(4, this.tinhTich(2,-2));
    }

    @Test
    public void tinhTich7() {
        Assert.assertEquals(10, this.tinhTich(2,6));
    }

    @Test
    public void tinhTich8() {
        Assert.assertEquals(10, this.tinhTich(5,2));
    }

    @Test
    public void tinhTich9() {
        Assert.assertEquals(10, this.tinhTich(2,5));
    }

    @Test
    public void tinhTich10() {
        Assert.assertEquals(40, this.tinhTich(2,12));
    }
}
