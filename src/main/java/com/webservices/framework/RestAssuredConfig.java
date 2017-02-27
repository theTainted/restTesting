package com.webservices.framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

/**
 * Created by syam.suryanarayanan on 2/27/2017.
 */
public class RestAssuredConfig {
    @BeforeSuite(alwaysRun=true)

    public void configure(){
        RestAssured.baseURI="http://t2.mobile.fleurametz.com";

        RestAssured.basePath= "/mobile-api/v1/";
            }
}
