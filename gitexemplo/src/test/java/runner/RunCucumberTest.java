package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import environment.ConfigProperties;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjects.ObjectProperties;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report","json:target/cucumber-parallel/1.json"},
		features = "src/test/resources/feature",
		glue = "glue",
		tags = "@UC44QualityReports"
)
public class RunCucumberTest {
	@BeforeClass
	public static void before() {
		ConfigProperties.inicializaProperties();
		ObjectProperties.inicializeRepository();
	}
}
