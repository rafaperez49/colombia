package elcolombiano.runner;


import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import elcolombiano.util.BeforeSuite;
import elcolombiano.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions (features = "src/test/resources/features/elcolombiano.feature",
				  tags= {"@registro"},
				  glue= {"elcolombiano.model", "elcolombiano.stepsdefinition"}, 
				  snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class RunnerTags {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("./src/test/resources/features/elcolombiano.feature");
	}
}