/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.freeclimbapi;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model tests for ApplicationResultAllOf
 */
public class ApplicationResultAllOfTest {
    private final ApplicationResultAllOf model = new ApplicationResultAllOf();
    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
        
        
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {

        model.setApplicationId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getApplicationId());
        
        
    }

    /**
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {

        model.setAlias("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAlias());
        
        
    }

    /**
     * Test the property 'voiceUrl'
     */
    @Test
    public void voiceUrlTest() {

        model.setVoiceUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getVoiceUrl());
        
        
    }

    /**
     * Test the property 'voiceFallbackUrl'
     */
    @Test
    public void voiceFallbackUrlTest() {

        model.setVoiceFallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getVoiceFallbackUrl());
        
        
    }

    /**
     * Test the property 'callConnectUrl'
     */
    @Test
    public void callConnectUrlTest() {

        model.setCallConnectUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallConnectUrl());
        
        
    }

    /**
     * Test the property 'statusCallbackUrl'
     */
    @Test
    public void statusCallbackUrlTest() {

        model.setStatusCallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStatusCallbackUrl());
        
        
    }

    /**
     * Test the property 'smsUrl'
     */
    @Test
    public void smsUrlTest() {

        model.setSmsUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSmsUrl());
        
        
    }

    /**
     * Test the property 'smsFallbackUrl'
     */
    @Test
    public void smsFallbackUrlTest() {

        model.setSmsFallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSmsFallbackUrl());
        
        
    }

}
