package com.github.yt.auto.example.cases.flow;

import com.Application;
import cucumber.api.java.en.And;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = Application.class)
@ContextConfiguration(classes = Config.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class FlowB {

    @And("^step 3")
    public void init2() {
        System.out.println("step 3");
    }

}
