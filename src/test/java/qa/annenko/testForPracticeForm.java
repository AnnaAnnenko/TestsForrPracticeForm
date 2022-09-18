package qa.annenko;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
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
      $("[id=firstName]").setValue("Anna");
      $("[id=lastName]").setValue("Abramova");
      $("[id=userEmail]").setValue("abramova@test.ru");
//      $("[#gender-radio-2".value=Female]").click();

//      $("[id=dateOfBirthInput]").click();
//      $("[.react-datepicker__year-select").click();
//      $("[.react-datepicker__year-select>[value=1996]").click();
//      $("[.form-control react-datepicker-ignore-onclickoutside]").setValue("18 Sep 1996");
//      $("[id=dateOfBirthInput]").setValue("18 Sep 1996");
      $("[id=subjectsContainer]").setValue("subject");
//      $("[id=lastName]").setValue("Abramova");
//      $("[id=lastName]").setValue("Abramova");
    }
}
