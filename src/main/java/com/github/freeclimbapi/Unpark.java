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

import java.util.Objects;
import java.util.Arrays;
import com.github.freeclimbapi.AddToConference;
import com.github.freeclimbapi.CreateConference;
import com.github.freeclimbapi.Dequeue;
import com.github.freeclimbapi.Enqueue;
import com.github.freeclimbapi.GetDigits;
import com.github.freeclimbapi.GetSpeech;
import com.github.freeclimbapi.Hangup;
import com.github.freeclimbapi.OutDial;
import com.github.freeclimbapi.Park;
import com.github.freeclimbapi.Pause;
import com.github.freeclimbapi.PerclCommand;
import com.github.freeclimbapi.Play;
import com.github.freeclimbapi.PlayEarlyMedia;
import com.github.freeclimbapi.RecordUtterance;
import com.github.freeclimbapi.Redirect;
import com.github.freeclimbapi.Reject;
import com.github.freeclimbapi.RemoveFromConference;
import com.github.freeclimbapi.Say;
import com.github.freeclimbapi.SendDigits;
import com.github.freeclimbapi.SetListen;
import com.github.freeclimbapi.SetTalk;
import com.github.freeclimbapi.Sms;
import com.github.freeclimbapi.StartRecordCall;
import com.github.freeclimbapi.TerminateConference;
import com.github.freeclimbapi.Unpark;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * The &#x60;Unpark&#x60; command resumes a parked call.  Execution continues with the first command in the PerCL scripted returned by the actionUrl specified in the Park command as long as the call is still in progress.  If the call is no longer in progress, any returned PerCL will not be executed. Unpark is a terminal command -- any commands following it in the same script are not executed.
 */
@ApiModel(description = "The `Unpark` command resumes a parked call.  Execution continues with the first command in the PerCL scripted returned by the actionUrl specified in the Park command as long as the call is still in progress.  If the call is no longer in progress, any returned PerCL will not be executed. Unpark is a terminal command -- any commands following it in the same script are not executed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Unpark extends PerclCommand {
  public Unpark() { 
    this.command = this.getClass().getSimpleName();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unpark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    return attributes;
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

