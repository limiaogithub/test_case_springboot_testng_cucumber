package com.github.yt.auto.example.cases;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

@CucumberOptions(glue = {"com.github.yt.auto.example.cases.flow2"}, features = "classpath:feature/test2.feature",
        format = {"pretty", "html:target/cucumber"})
public class FeatureB {

    @Test
    public void run() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}