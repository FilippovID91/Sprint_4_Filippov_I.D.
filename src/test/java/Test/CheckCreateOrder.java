package Test;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import qa_scooter_praktikum_services.PageOrder;
import qa_scooter_praktikum_services.PageQAScooter;

@RunWith(Parameterized.class)
public class CheckCreateOrder extends TestBase {
    private final String firstName;
    private final String lastName;
    private final String addresses;
    private final String phone;
    private final String comment;

    public CheckCreateOrder(String firstName, String lastName, String addresses, String phone, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
        this.phone = phone;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderValues() {
        return new Object[][]{
                {"Иван", "Иванов", "Екатеринбург, Чайковского, 86в", "+79049811113", "тестовый заказ"},
                {"Петр", "Петров", "Екатеринбург, Щорса, 105", "+79049811111", "тестовый заказ"},
        };
    }

    @Test
    public void CreateOrderButtonInHeader() {
        // создание объекта класса страницы PageQAScooter
        PageQAScooter objPageQAScooter = new PageQAScooter(driver);
        // переход на страницу qa-scooter.praktikum-services.ru
        objPageQAScooter.openQAScooterPracticumServices();
        // клик по кнопке "Заказать"
        objPageQAScooter.clickOrderInHeader();

        // создание объекта класса страницы PageOrder
        PageOrder objPageOrder = new PageOrder(driver);
        // ожидание прогрузки формы заказа "Для кого самокат"
        objPageOrder.waitForLoadOrderWhoseScooter();
        // создание нового заказа со значениями метода getOrderValues
        objPageOrder.newOrder(firstName, lastName, addresses, phone, comment);
        // проверка создания заказа
        MatcherAssert.assertThat(objPageOrder.getOrderCreationSuccess(), CoreMatchers.is("Заказ оформлен"));
    }

    @Test
    public void CreateOrderButtonInBody() {
        // создание объекта класса страницы PageQAScooter
        PageQAScooter objPageQAScooter = new PageQAScooter(driver);
        // переход на страницу qa-scooter.praktikum-services.ru
        objPageQAScooter.openQAScooterPracticumServices();
        // скролл до кнопки "Заказать" после блока "Как это работает"
        objPageQAScooter.scrollToButtonOrderInBody();
        // клик по кнопке "Заказать"
        objPageQAScooter.clickOrderInBody();

        // создание объекта класса страницы PageOrder
        PageOrder objPageOrder = new PageOrder(driver);
        // ожидание прогрузки формы заказа "Для кого самокат"
        objPageOrder.waitForLoadOrderWhoseScooter();
        // создание нового заказа со значениями метода getOrderValues
        objPageOrder.newOrder(firstName, lastName, addresses, phone, comment);
        // проверка создания заказа
        MatcherAssert.assertThat(objPageOrder.getOrderCreationSuccess(), CoreMatchers.is("Заказ оформлен"));
    }
}