package elcolombiano.runner;


import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import elcolombiano.util.BeforeSuite;
import elcolombiano.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions (features = "src/test/resources/features/rest_ejemplo.feature",
				  tags= {"@tag1"},
				  glue= {"elcolombiano.stepsdefinition", "elcolombiano.model"}, 
				  snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class StarWarsRunner {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("./src/test/resources/features/rest_ejemplo.feature");
	}
}