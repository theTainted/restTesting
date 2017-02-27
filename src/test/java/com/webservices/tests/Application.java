package com.webservices.tests;

import com.webservices.tests.common.EndPoint;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by syam.suryanarayanan on 2/27/2017.
 */
public class Application {
@Test
    public void validateApplication(){
        given().get("http://t2.mobile.fleurametz.com/nl-NL/mobile-api/v1/application?contextId=4999").then().statusCode(200).log().all();
    }

    @Test(groups="demo")
    public void validateApplication2(){
        given().get(EndPoint.GET_APPLICATION).then().statusCode(200).log().all();

    }
}
