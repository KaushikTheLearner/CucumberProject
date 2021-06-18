package junitTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/Features",
                 glue="stepDefinitions",tags="@SmokeTest",dryRun=true,monochrome=true,
                 plugin= {"pretty", "html:target/cucumber.html","json:target/report.json","junit:target/result.xml"})


// tags="@SmokeTest"
//tags="@SmokeTest or @RegressionTest"
//tags="not @SanityTest"
//tags="@SmokeTest and @RegressionTest"
// 1 background per feature file
// Background keyword is a common prerequisite for all scenarios in a feature file
// Background and Hooks can not be used together
// In order to generate reports write this attribute within Cucumberoptions
//plugin= {"pretty", "html:target/cucumber.html","json:target/report.json","junit:target/result.xml"}
// dryRun=true -> checks if all the feature scenarios has a step definition if not gives suggestion in console
//monochrome=true -> provides a neat and clean report in the console
// http://rlogiacco.github.io/Natural  -> you can download natural plugin from this site omg

// All about Jenkins
// download jenkins from this site ->https://www.jenkins.io/download/
//download Generic Java Package (.war)
// In cmd, go to location where jenkins folder is present and type: java -jar jenkins.war -httpPort=8080
// go to browser and type localhost:port you have provided enter the generated admin password then download plugins
// You will come to the Homepage,Need to configure Java and Maven->
// To configure click on Manage Jenkins>> Global tool configuration enter name and home path for java and maven
// Now you need to create a job in Jenkins -> Click on New Item>>Give Item name>>select Freestyle project>>Ok
// Go to the eclipse workspace folder and copy your project and paste it in .jenkins folder (generally the path is C:\Users\admin)
//In source code management section, select Use custom workspace>> and give directory name as ${JENKINS}/Automation or ${JENKINS_HOME}/Automation or you can pass your eclipse project location path 
//Go to Build>> Add Build setup>> Invoke top level Maven targets>>select maven version and give goal as "test"
//Click on save and now you will be on Dashboard page>> You will see your created job there
//Click on your job and then click on build now >> Go to recent build and click on console output to see the test results
//To run xml reports to the jenkins: go to configure>> Postbuild Actions
//In testreport xmls field enter the path of the xml result : target/results.xml
//click on Ok, you will get a link called Latest test Result on your project page
//Now you can also control your execution of testcases through Jenkins
//All you need to do is: Go to your project>> configure>> go to build section and provide this command in goals:test -Dcucumber.options="--tags @SmokeTest"
//There is a more optimized way: On the same page, go to general section and choose option as This project is parametrized>> Add Parameter>>Choice Parameter
//In Name field write tags and in Choices field write the name of the tags like Smoke, regression etc... and click on save
// Now on your project page you will get an option as Build with Parameters, click the option.
// Now in dropdown you will see all the tags that you had mentioned , just select the tag you want to execute and click on Build option
//A word of caution for this to happen: in the build section you need to provide this command in goals:test -Dcucumber.options="--tags @"$Tags""


// In real time we dont touch the code and pust it to git repository, so we can not run every
// time by changing tags from testrunner file because we have to first downlaod the code from
// git and make changes and then upload again and if we need more changes again we have to download
//So, in real time we perform the execution through cmd by providing this code
//mvn test -Dcucumber.options="--tags @SmokeTest"
public class JunitTestRunner {

}
