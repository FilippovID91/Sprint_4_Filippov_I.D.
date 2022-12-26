package Test;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import qa_scooter_praktikum_services.PageQAScooter;

import static org.hamcrest.CoreMatchers.is;

public class CheckDropDownQuestionsAboutImportant extends TestBase {

    @Test
    public void CheckDropDownQuestionsAboutImportant_1() {
        // создание объекта класса страницы PageQAScooter
        PageQAScooter objPageQAScooter = new PageQAScooter(driver);
        // переход на страницу qa-scooter.praktikum-services.ru
        objPageQAScooter.openQAScooterPracticumServices();
        // скролл до раскрывающегося списка "Вопросы о важном" №1
        objPageQAScooter.scrollToQuestionsAboutImportant_1();
        // нажатие по раскрывающемуся списку "Вопросы о важном" №1
        objPageQAScooter.clickQuestionsAboutImportant_1();
        // ожидание раскрытия списка "Вопросы о важном" №1
        objPageQAScooter.waitForLoadBodyQuestionsAboutImportant_1();
        // получение текста раскрывающегося списка "Вопросы о важном" №1
        String bodyQuestionsAboutImportant_1 = objPageQAScooter.BodyQuestionsAboutImportant_1();
        // задаем ожидаемый результат раскрывающегося списка "Вопросы о важном" №1
        String bodyQuestions_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        // проверка, что полученное значение совпадает с bodyQuestions_1
        MatcherAssert.assertThat(bodyQuestionsAboutImportant_1, is(bodyQuestions_1));
    }

    @Test
    public void CheckDropDownQuestionsAboutImportant_2() {
        // создание объекта класса страницы PageQAScooter
        PageQAScooter objPageQAScooter = new PageQAScooter(driver);
        // переход на страницу qa-scooter.praktikum-services.ru
        objPageQAScooter.openQAScooterPracticumServices();
        // скролл до раскрывающегося списка "Вопросы о важном" №2
        objPageQAScooter.scrollToQuestionsAboutImportant_2();
        // нажатие по раскрывающемуся списку "Вопросы о важном" №2
        objPageQAScooter.clickQuestionsAboutImportant_2();
        // ожидание раскрытия списка "Вопросы о важном" №2
        objPageQAScooter.waitForLoadBodyQuestionsAboutImportant_2();
        // получение текста раскрывающегося списка "Вопросы о важном" №2
        String bodyQuestionsAboutImportant_2 = objPageQAScooter.BodyQuestionsAboutImportant_2();
        // задаем ожидаемый результат раскрывающегося списка "Вопросы о важном" №2
        String bodyQuestions_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        // проверка, что полученное значение совпадает с bodyQuestions_2
        MatcherAssert.assertThat(bodyQuestionsAboutImportant_2, is(bodyQuestions_2));
    }
}