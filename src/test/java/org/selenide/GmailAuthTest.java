package org.selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GmailAuthTest {
    public static void main(String[] args) {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setBinary("Binary path of the Chrome");
//

        // Configure Selenide
//        Configuration.browser = "chrome";

        open("https://accounts.google.com/signin");

        $("#identifierId").val("a.madiko14@gmail.com");
        $("div[id='identifierNext'] button").click();

        $("input[type='password']").val("esbzlwqogqwkqyiv");
        $("div[id='passwordNext'] button").click();

        $("div[class='gb_2a']").shouldHave(text("Gmail"));
    }
}
