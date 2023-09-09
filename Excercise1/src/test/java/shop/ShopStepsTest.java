package shop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/Placing-new-order.feature", glue = "shop2",
        plugin = {"pretty", "html:out.html"})
//@CucumberOptions(features = "src/Cucumber/Features/New-Address-creation.feature", glue = "shop",
//        plugin = {"pretty", "html:out.html"})
//@CucumberOptions(features = "src/Cucumber/Features/",
//        plugin = {"pretty", "html:out.html"})

public class ShopStepsTest {

}
