package org.itacademy.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class NewTest {

    @BeforeTest
    public static void setup() {
        System.out.println("BEFORE TEST");
        // прочитать из файла конфига путь к хромдрайверу и тестируемый урл
        Config.getProperties();
    }

    @Test(description = "this test pushes the credit button")
    public void verifyButtonCreditTest() {

        // test TestNG soft assert
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(true, "not true");

        System.setProperty("webdriver.chrome.driver", Config.getChromeDriver());
        WebDriver driver = new ChromeDriver();

// неявное ожидание при каждом поиске элемента 10 сек
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// передача драйверу адреса тестируемой страницы из файла конфига
        driver.get(Config.getTestPage());

// создаем объект страница
        FirstPage firstPage = new FirstPage(driver);

// вызываем у страницы метод нажать на кнопку
        firstPage.clickCreditButton();

// ожидание просто посмотреть на открытую страницу кредиты
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
// закрыть браузер
        driver.quit();
    }
}
