package com.webservices.framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by syam.suryanarayanan on 2/27/2017.
 */
public class RestAssuredConfig {
@BeforeSuite(alwaysRun = true)

    public void configure(){
        RestAssured.baseURI="http://t2.mobile.fleurametz.com/{languageISO}";

        RestAssured.basePath= "/mobile-api/v1";
            }
  /*  public String baseURL="http://t2.mobile.fleurametz.com";
    public String locale="/nl-NL";
    public String apiVersion="/mobile-api/v1";
    public String endPointNameApplication="/application?contextId=4999";*/
}

//http://t2.mobile.fleurametz.com/nl-NL/mobile-api/v1/application?contextId=4999"//