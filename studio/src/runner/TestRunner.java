package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/studio/7_Digits_input.feature",
				glue= {"stepDefinitions"}
		)

public class TestRunner {
	
/*	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
*/
}
