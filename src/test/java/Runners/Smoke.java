package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@meliserva",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "rerun:target/failed.txt"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Smoke {

}
