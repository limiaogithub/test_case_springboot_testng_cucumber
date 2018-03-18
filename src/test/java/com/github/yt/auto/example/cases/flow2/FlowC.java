package com.github.yt.auto.example.cases.flow2;

import com.Application;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = Application.class)
@ContextConfiguration(classes = Config.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class FlowC {

    @Given("^step 4")
    public void init1() {
        System.out.println("step 4");
    }

    @And("^step 5")
    public void init2() {
        System.out.println("step 5");
    }

}
