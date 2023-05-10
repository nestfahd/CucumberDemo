package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/runner/Testrun.java"},
glue = {"step"},dryRun = false,
plugin = { "html:Reports/HtmlReports.html",	"json:Reports/JsonReports.json"},
monochrome = true,
publish = true)
public class Testrun {
	

}
