package org.itacademy.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {
    // класс Page Object для взаимодействия с элементами страницы

    // поле класса FirstPage
    public WebDriver driver;

    // конструктор класса FirstPage. ему передаем параметр объект вебдрайвер
    public FirstPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    // локатор кнопки. поле класса с аннотацией??
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[4]/footer/div/div[1]/div[1]/ul/li[1]/a")
    private WebElement CreditButton;

    // метод нажатия кнопки
    public void clickCreditButton() {
        System.out.println(CreditButton.getText());
        CreditButton.click();
    }
}