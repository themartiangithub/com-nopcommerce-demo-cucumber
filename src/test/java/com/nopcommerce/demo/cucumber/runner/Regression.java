package com.nopcommerce.demo.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/nopcommerce/demo/cucumber",
        tags = "@Regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class Regression {


}
