package qa_scooter_praktikum_services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageOrder {
    // конструктор класса
    public PageOrder(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    // локатор поля ввода «Имя»
    private By orderFirstName = By.xpath("//input[@placeholder='* Имя']");
    // локатор поля ввода «Фамилия»
    private By orderLastName = By.xpath("//input[@placeholder='* Фамилия']");
    // локатор поля ввода «Адрес: куда привезти заказ»
    private By orderAddresses = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    // локатор выпадающего списка «Станция метро»
    private By orderMetroStation = By.xpath("//input[@placeholder='* Станция метро']");
    // локатор станции "Черкизовская" выпадающего списка «Станция метро»
    private By MetroStationCherkizovskaya = By.xpath("//*[text() = 'Черкизовская']");
    // локатор поля ввода «Телефон: на него позвонит курьер»
    private By orderPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    // локатор поля выбора даты «Когда привезти самокат»
    private By orderDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    // локатор даты 28 число месяца «Когда привезти самокат»
    private By orderDate28 = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--028']");
    // локатор выпадающего списка «Срок аренды»
    private By orderRentalPeriod = By.className("Dropdown-placeholder");
    // локатор «Срок аренды» одни сутки
    private By orderRentalPeriodOneDay = By.xpath("//*[text() = 'сутки']");
    // локатор чек-бокса цвета самоката «черный жемчуг»
    private By orderScooterColorBlack = By.xpath("//label[@for='black']");
    // локатор поля ввода «Комментарий для курьера»
    private By orderComment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    // локатор успешно созданного заказа
    private By orderCreateSuccess = By.className("Order_ModalHeader__3FDaJ");

    // локатор кнопки «Далее»
    private By orderNextPageButton = By.xpath("//button[((@class = 'Button_Button__ra12g Button_Middle__1CSJM') and (text() = 'Далее'))]");
    // локатор кнопки «Заказать»
    private By orderSendButton = By.xpath("//button[((@class = 'Button_Button__ra12g Button_Middle__1CSJM') and (text() = 'Заказать'))]");
    // локатор кнопки «Да» в модальном окне подтверждения создания заказа
    private By orderCreateButton = By.xpath("//button[((@class = 'Button_Button__ra12g Button_Middle__1CSJM') and (text() = 'Да'))]");

    // метод заполнения поля ввода «Имя»
    public void setFirstName(String firstName) {
        driver.findElement(orderFirstName).sendKeys(firstName);
    }

    // метод заполнения поля ввода «Фамилия»
    public void setLastName(String lastName) {
        driver.findElement(orderLastName).sendKeys(lastName);
    }
    // метод заполнения поля ввода «Адрес: куда привезти заказ»
    public void setAddresses(String addresses) {
        driver.findElement(orderAddresses).sendKeys(addresses);
    }
    // метод раскрытия выпадающего списка "Станция метро"
    public void clickMetroStation() {
        driver.findElement(orderMetroStation).click();
    }
    // метод выбора станции "Черкизовская" из выпадающего списка "Станция метро"
    public void clickMetroStationCherkizovskaya() {
        driver.findElement(MetroStationCherkizovskaya).click();
    }
    // метод заполнения поля ввода «Телефон: на него позвонит курьер»
    public void setPhone(String phone) {
        driver.findElement(orderPhone).sendKeys(phone);
    }

    // метод открытия календаря выбора даты «Когда привезти самокат»
    public void clickOrderDate() {
        driver.findElement(orderDate).click();
    }
    // метод выбора даты 28 число месяца «Когда привезти самокат»
    public void clickDate28() {
        driver.findElement(orderDate28).click();
    }
    // метод раскрытия выпадающего списка «Срок аренды»
    public void clickRentalPeriod() {
        driver.findElement(orderRentalPeriod).click();
    }
    // метод выбора срока аренды "одни сутки"
    public void clickRentalPeriodOneDay() {
        driver.findElement(orderRentalPeriodOneDay).click();
    }
    // метод выбора чек-бокса цвета самоката "черный жемчуг"
    public void clickScooterColorBlack() {
        driver.findElement(orderScooterColorBlack).click();
    }
    // метод заполнения поля ввода «Комментарий для курьера»
    public void setOrderComment(String comment) {
        driver.findElement(orderComment).sendKeys(comment);
    }

    // метод клика по кнопке "Далее"
    public void clickOrderNextPage() {
        driver.findElement(orderNextPageButton).click();
    }
    // метод клика по кнопке "Заказать"
    public void clickOrderSend() {
        driver.findElement(orderSendButton).click();
    }
    // метод клика по кнопке "Да"
    public void clickOrderCreateButton() {
        driver.findElement(orderCreateButton).click();
    }

    // метод ожидания прогрузки формы заказа "Для кого самокат"
    public void waitForLoadOrderWhoseScooter() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderFirstName));
    }
    // метод ожидания прогрузки формы заказа "Про аренду"
    public void waitForLoadOrderAboutRent() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderDate));
    }
    // метод ожидания раскрытия списка "Станция метро"
    public void waitForLoadMetroStation() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(MetroStationCherkizovskaya));
    }
    // метод ожидания открытия календаря выбора "Когда привезти самокат"
    public void waitForLoadOrderDate() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderDate28));
    }
    // метод ожидания раскрытия списка "Срок аренды"
    public void waitForLoadOrderRentalPeriod() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderRentalPeriodOneDay));
    }
    // метод ожидания модального окна подтверждения оформления заказа
    public void waitForLoadOrderConfirmation() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderCreateButton));
    }
    // метод ожидания создания заказа
    public void waitForLoadOrderCreateSuccess() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderCreateSuccess));
    }

    // метод получения текста "Заказ оформлен"
    public String getOrderCreationSuccess() {
        return driver.findElement(orderCreateSuccess).getText();
    }

    // метод создания нового заказа
    public void newOrder(String firstName, String lastName, String addresses, String phone, String comment) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddresses(addresses);
        clickMetroStation();
        waitForLoadMetroStation();
        clickMetroStationCherkizovskaya();
        setPhone(phone);
        clickOrderNextPage();
        waitForLoadOrderAboutRent();
        clickOrderDate();
        waitForLoadOrderDate();
        clickDate28();
        clickRentalPeriod();
        waitForLoadOrderRentalPeriod();
        clickRentalPeriodOneDay();
        clickScooterColorBlack();
        setOrderComment(comment);
        clickOrderSend();
        waitForLoadOrderConfirmation();
        clickOrderCreateButton();
        waitForLoadOrderCreateSuccess();
    }
}