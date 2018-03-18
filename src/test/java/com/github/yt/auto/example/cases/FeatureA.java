package com.github.yt.auto.example.cases;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

@CucumberOptions(glue = {"com.github.yt.auto.example.cases.flow"}, features = "classpath:feature/test.feature",
        format = {"pretty", "html:target/cucumber"})
public class FeatureA {

    @Value("${yt.jdbc_username}")
    private String jdbc_username;

    @Test
    public void run() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}