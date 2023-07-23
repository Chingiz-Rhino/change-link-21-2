package conflict.guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class firstConflictTest {
    @Test
    void conflictTest(){
        Configuration.pageLoadStrategy = "eager";
        Selenide.open("https://yandex.ru");
    }
}