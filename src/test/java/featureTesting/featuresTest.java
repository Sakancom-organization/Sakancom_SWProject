
package featureTesting;

import org.junit.runner.RunWith;
 import io.cucumber.junit.Cucumber;
 import io.cucumber.junit.CucumberOptions;
 import io.cucumber.junit.CucumberOptions.SnippetType;
 
 
 @RunWith(Cucumber.class)
 @CucumberOptions(features="tenantFeatures",
 plugin= {"html:target/cucumber/wikipedia.html"},
 monochrome= true,
 snippets=SnippetType.CAMELCASE,
 glue= {"featureTesting"},
 tags = "not(@wip)")
 
 
public class featuresTest {

}
