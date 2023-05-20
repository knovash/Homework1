package org.itacademy.homework1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {

    @Test
    public void verifyNameTest(){

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(2 == 2, "not true");
    }

}
