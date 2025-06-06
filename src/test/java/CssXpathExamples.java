import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {


    void cssXPathExamples() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        //$x( xpathExpression: "//*[@id=email]").setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email"
        $("[name=email]").setValue("1");
        $(byName("email]")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box"
        $("[class=login_form_input_box").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".login_form_input_box.inputtext").setValue("1");
        $("input.login_form_input_box.inputtext").setValue("1");

        /*
            <div class="inputtext"
                 <input type="email" class="login_form_input_box">
            </div>
         */
        $(".login_form_input_box .inputtext").setValue("1");
        $(".login_form_input_box").$(".inputtext").setValue("1");


        // <div>Hello qa.guru</div> Поиск по тексту
        //$x( xpathExpression: "//div[text()='Hello qa.guru']");
        $(byText( "Hello qa.guru"));
        $(withText( "lo qa.guru"));


    }
}
