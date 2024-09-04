package com.example.hw22.Details;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;

    @Autowired
    public Engine(Starter starter, SparkPlug sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String toString() {
        return "Engine [starter=" + starter + ", sparkPlug=" + sparkPlug + "]";
    }
}
