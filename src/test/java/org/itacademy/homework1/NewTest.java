package org.itacademy.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {

    @BeforeTest
    public static void setup() {
        System.out.println("BEFORE TEST");
        Config.getProperties();
    }

    @Test
    public void verifyNameTest() {

        // test TestNG soft assert
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(true, "not true");

        System.setProperty("webdriver.chrome.driver", Config.getChromeDriver());
        WebDriver driver = new ChromeDriver();
        driver.get(Config.getTestPage());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
