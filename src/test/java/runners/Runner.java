package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//      para rodar os teste do cucumber junto com junit
        plugin = {
            "pretty",
            "html:target/reports/cucumber.json"
        },
        tags = "@BlogDoAgi",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = false,
        stepNotifications = true,
        features = "src/test/resources",
        glue = "steps"
)
public class Runner {
}
