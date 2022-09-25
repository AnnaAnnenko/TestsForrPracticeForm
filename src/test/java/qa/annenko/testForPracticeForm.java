package qa.annenko;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class testForPracticeForm {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x680";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void checkFieldsOfForm() {
      open("https://demoqa.com/automation-practice-form");
      executeJavaScript("$('footer').remove()");
      executeJavaScript("$('#fixedban').remove()");
      $("#firstName").setValue("Anna");
      $("#lastName").setValue("Abramova");
      $("#userEmail").setValue("abramova@test.ru");
      $("#gender-radio-2").parent().click();
      $("#userNumber").setValue("9222365736");
      $("#dateOfBirthInput").click();
      $(".react-datepicker__month-select").selectOption("October");
      $(".react-datepicker__year-select").selectOption("2009");
      $(".react-datepicker__day--015:not(.react-datepicker__day--outside-month)").click();
      $("#subjectsInput").setValue("History").pressEnter();
      $("[for=hobbies-checkbox-2]").click();
      $("#uploadPicture").uploadFromClasspath("Img/1.png");
      $("#currentAddress").setValue("Test Current Address");
      $("#state").click();
      $("#stateCity-wrapper").$(byText("NCR")).click();
      $("#city").click();
      $("#stateCity-wrapper").$(byText("Delhi")).click();
      $("#submit").click();
// Проверяем результат
      $(".modal-dialog").should(appear);
      $(".table-responsive").shouldHave(text("Anna Abramova"), text("abramova@test.ru"), text("9222365736"));
    }
}
