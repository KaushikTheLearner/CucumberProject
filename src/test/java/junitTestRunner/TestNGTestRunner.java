package junitTestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "src/test/java/Features",
glue="stepDefinitions")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
