package com.github.yt.auto.example.api.modela.impl;

import com.github.yt.auto.example.api.modela.ModelAAPI;
import org.springframework.stereotype.Component;

@Component("modelAAPI")
public class ModelAAPIImpl implements ModelAAPI {


    public Object collectFieldA() {
        System.out.println("collectFieldA");
        return null;
    }

    public void validateFieldA() {
        System.out.println("validateFieldA");
    }
}
