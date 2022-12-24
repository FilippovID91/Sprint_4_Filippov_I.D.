package qa_scooter.praktikum_services;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageQAScooter {
    // конструктор класса
    public PageQAScooter(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    // локатор кнопки «Заказать» в шапке страницы
    private By orderInHeader = By.xpath("//button[((@class = 'Button_Button__ra12g') and (text() = 'Заказать'))]");
    // локатор кнопки «Заказать» после блока "Как это работает"
    private By orderInBody = By.xpath("//button[((@class = 'Button_Button__ra12g Button_Middle__1CSJM') and (text() = 'Заказать'))]");

    // локатор раскрывающегося списка "Вопросы о важном" №1
    private By questionsAboutImportant_1 = By.id("accordion__heading-0");
    // локатор раскрывающегося списка "Вопросы о важном" №2
    private By questionsAboutImportant_2 = By.id("accordion__heading-1");

    // локатор содержимого раскрывающегося списка "Вопросы о важном" №1
    private By bodyQuestionsAboutImportant_1 = By.xpath("//*[text() = 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    // локатор содержимого раскрывающегося списка "Вопросы о важном" №2
    private By bodyQuestionsAboutImportant_2 = By.xpath("//*[text() = 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");

    // метод перехода на страницу qa-scooter.praktikum-services.ru
    public void openQAScooterPracticumServices() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    // метод клика по кнопке «Заказать» в шапке страницы
    public void clickOrderInHeader() {
        driver.findElement(orderInHeader).click();
    }
    // метод клика по кнопке «Заказать» после блока "Как это работает"
    public void clickOrderInBody() {
        driver.findElement(orderInBody).click();
    }

    // метод скролла до кнопки "Заказать" после блока "Как это работает"
    public void scrollToButtonOrderInBody() {
        WebElement element = driver.findElement(orderInBody);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    // метод скролла до раскрывающегося списка "Вопросы о важном" №1
    public void scrollToQuestionsAboutImportant_1() {
        WebElement element = driver.findElement(questionsAboutImportant_1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    // метод скролла до раскрывающегося списка "Вопросы о важном" №2
    public void scrollToQuestionsAboutImportant_2() {
        WebElement element = driver.findElement(questionsAboutImportant_1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // метод клика по выпадающему списку "Вопросы о важном" №1
    public void clickQuestionsAboutImportant_1() {
        driver.findElement(questionsAboutImportant_1).click();
    }
    // метод клика по выпадающему списку "Вопросы о важном" №2
    public void clickQuestionsAboutImportant_2() {
        driver.findElement(questionsAboutImportant_2).click();
    }

    // метод ожидания раскрытия списка "Вопросы о важном" №1
    public void waitForLoadBodyQuestionsAboutImportant_1() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(bodyQuestionsAboutImportant_1));}
    // метод ожидания раскрытия списка "Вопросы о важном" №2
    public void waitForLoadBodyQuestionsAboutImportant_2() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(bodyQuestionsAboutImportant_2));}

    // метод получения текста раскрывающегося списка "Вопросы о важном" №1
    public String BodyQuestionsAboutImportant_1() {
        return driver.findElement(bodyQuestionsAboutImportant_1).getText();
    }
    // метод получения текста раскрывающегося списка "Вопросы о важном" №2
    public String BodyQuestionsAboutImportant_2() {
        return driver.findElement(bodyQuestionsAboutImportant_2).getText();
    }
}