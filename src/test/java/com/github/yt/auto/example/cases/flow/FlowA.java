package com.github.yt.auto.example.cases.flow;

import com.Application;
import com.github.yt.auto.example.api.modela.ModelAAPI;
import com.github.yt.configuration.DBConnection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = Application.class)
@ContextConfiguration(classes = Config.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class FlowA {

    @Autowired
    //用于测试..
    private DBConnection dBConnection;

    @Autowired
    private ModelAAPI modelAAPI;

    @Given("^step 1")
    public void init1() {
        modelAAPI.collectFieldA();
        System.out.println("step 1");
    }

    @And("^step 2")
    public void init2() {
        modelAAPI.validateFieldA();
        System.out.println("step 2");
    }

}
