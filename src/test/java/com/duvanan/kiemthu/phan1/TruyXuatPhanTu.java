package com.duvanan.kiemthu.phan1;

import org.junit.Assert;
import org.junit.Test;

public class TruyXuatPhanTu {
    public int getElementAtIndex(int[] arr, int index) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    @Test
    public void getElementAtIndex1() {
        int[] arr = {1,2,3,4,5};
        Assert.assertEquals(3, this.getElementAtIndex(arr,1));
    }

    @Test
    public void getElementAtIndex2() {
        int[] arr = {1,2,3,4,5};
        Assert.assertEquals(4, this.getElementAtIndex(arr,2));
    }

    @Test
    public void getElementAtIndex3() {
        int[] arr = {};
        Assert.assertEquals(3, this.getElementAtIndex(arr, 3));
    }


    @Test
    public void getElementAtIndex4() {
        int[] arr = null;
        Assert.assertEquals(3, this.getElementAtIndex(arr, 4));
    }

    @Test
    public void getElementAtIndex5() {
        int[] arr = {1,2,3,4,-5};
        Assert.assertEquals(3, this.getElementAtIndex(arr, 6));
    }

    @Test
    public void getElementAtIndex6() {
        int[] arr = {1,2,-3,4,5};
        Assert.assertEquals(3, this.getElementAtIndex(arr, -5));
    }

    @Test
    public void getElementAtIndex7() {
        int[] arr = {1,2,3,-4,5};
        Assert.assertEquals(3, this.getElementAtIndex(arr, 5));
    }

    @Test
    public void getElementAtIndex8() {
        int[] arr = {-1,-2,-3,-4,-5};
        Assert.assertEquals(3, this.getElementAtIndex(arr,2));
    }

    @Test
    public void getElementAtIndex9() {
        int[] arr = {1,-2,3,4,5};
        Assert.assertEquals(3, this.getElementAtIndex(arr,-2));
    }

    @Test
    public void getElementAtIndex10() {
        int[] arr = {-1,2,3,4,5};
        Assert.assertEquals(3, this.getElementAtIndex(arr,-9));
    }
}
