package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ServicesTest {

    @org.junit.Test
    public void returnIndices() throws Exception {
        int[] firstCase = Services.returnIndices(new int[] {2, 3}, 5);
        Assert.assertEquals(0, firstCase[0]);
        Assert.assertEquals(1, firstCase[1]);

        int[] secondCase = Services.returnIndices(new int[] {1, 3, 5, 6}, 9);
        Assert.assertEquals(1, secondCase[0]);
        Assert.assertEquals(3, secondCase[1]);
    }

    @Test(expected = Exception.class)
    public void returnIndexExceptionCase() throws Exception {
        int[] secondCase = Services.returnIndices(new int[] {1, 3}, -1);
    }
}