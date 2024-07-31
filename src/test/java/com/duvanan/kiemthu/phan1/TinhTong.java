package com.duvanan.kiemthu.phan1;

import org.junit.Assert;
import org.junit.Test;

public class TinhTong {

    //Sử dụng các kỹ thuật biên, phân vùng tương đương viết 10 test case để thực hiện chức năng tính tổng của 2 số nguyên.
    // Kiểm tra 2 số nhập vào có phải là số nguyên hay không
    private int tinhTong(int a, int b) {
        return a + b;
    }

    @Test
    public void tinhTong2() {
        Assert.assertEquals(5, this.tinhTong(3,2));
    }

    @Test
    public void tinhTong3() {
        Assert.assertEquals(4, this.tinhTong(3,2));
    }

    @Test
    public void tinhTong4() {
        Assert.assertEquals(-1, this.tinhTong(-3,2));
    }

    @Test
    public void tinhTong5() {
        Assert.assertEquals(5, this.tinhTong(-3,2));
    }

    @Test
    public void tinhTong6() {
        Assert.assertEquals(1, this.tinhTong(3,-2));
    }

    @Test
    public void tinhTong7() {
        Assert.assertEquals(5, this.tinhTong(3,-2));
    }

    @Test
    public void tinhTong8() {
        Assert.assertEquals(5, this.tinhTong(-3,-2));
    }

    @Test
    public void tinhTong9() {
        Assert.assertEquals(-5, this.tinhTong(-3,-2));
    }

    @Test
    public void tinhTong10() {
        Assert.assertEquals(-2, this.tinhTong(3,-2));
    }
}
