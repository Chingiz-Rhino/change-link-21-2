package conflict.guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class conflictTest {
    @Test
    void conflictTest(){
        Configuration.pageLoadStrategy = "eager";
        Selenide.open("https://google.ru");
        $("[name=q]").setValue("Selenide").pressEnter();
        $("#search").shouldHave(text("https://ru.selenide.org"));
    }
}