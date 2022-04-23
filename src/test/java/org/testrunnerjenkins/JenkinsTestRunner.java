package org.testrunnerjenkins;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\FaceBookLogin.feature",
					glue="org.stepdefjenkins",
					monochrome = true, dryRun=false
					)
public class JenkinsTestRunner {

}
