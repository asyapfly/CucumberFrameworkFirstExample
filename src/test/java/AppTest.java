import static org.junit.Assert.assertTrue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/"
        },
        glue = {
                "org.example.steps"
        },
        tags = {
                "@e2e_access"
        }
)

public class AppTest 
{

}
