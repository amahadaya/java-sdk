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
import com.github.freeclimbapi.ParkAllOf;
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
 * The &#x60;Park&#x60; command allows a caller to be put on hold.  You can provide hold music,messages,etc until ready to resume the call. Park is a terminal command.  Actions performed on the Call while on hold are provided in a PerCL script in response to the waitUrl property. Actions performed on the Call after it has been unparked (resumed) will be provided in a PerCL script in response to the actionUrl provided. A Call can be resumed in two ways -- REST API invocation or the Unpark percl command. No actions can be nested within Park and Park cannot be nested in any other actions. 
 */
@ApiModel(description = "The `Park` command allows a caller to be put on hold.  You can provide hold music,messages,etc until ready to resume the call. Park is a terminal command.  Actions performed on the Call while on hold are provided in a PerCL script in response to the waitUrl property. Actions performed on the Call after it has been unparked (resumed) will be provided in a PerCL script in response to the actionUrl provided. A Call can be resumed in two ways -- REST API invocation or the Unpark percl command. No actions can be nested within Park and Park cannot be nested in any other actions. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Park extends PerclCommand {
  public static final String SERIALIZED_NAME_WAIT_URL = "waitUrl";
  @SerializedName(SERIALIZED_NAME_WAIT_URL)
  private String waitUrl;

  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
  private String notificationUrl;

  public Park() { 
    this.command = this.getClass().getSimpleName();
  }

  public Park waitUrl(String waitUrl) {
    
    this.waitUrl = waitUrl;
    return this;
  }

   /**
   * Specifies a URL pointing to a PerCL script containing actions to be executed while the caller is Parked. Once the script returned by the waitUrl runs out of commands to execute, FreeClimb will re-request the waitUrl and start over, essentially looping the script requests indefinitely.
   * @return waitUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a URL pointing to a PerCL script containing actions to be executed while the caller is Parked. Once the script returned by the waitUrl runs out of commands to execute, FreeClimb will re-request the waitUrl and start over, essentially looping the script requests indefinitely.")

  public String getWaitUrl() {
    return waitUrl;
  }


  public void setWaitUrl(String waitUrl) {
    this.waitUrl = waitUrl;
  }


  public Park actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * A request is made to this URL when the Call is resumed, which can occur if the Call is resumed via the Unpark command, the REST API (POST to Call resource), or the caller hangs up. The PerCL script returned in response to the actionUrl will be executed on the resumed call.
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A request is made to this URL when the Call is resumed, which can occur if the Call is resumed via the Unpark command, the REST API (POST to Call resource), or the caller hangs up. The PerCL script returned in response to the actionUrl will be executed on the resumed call.")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public Park notificationUrl(String notificationUrl) {
    
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * URL to be invoked when the Call is parked. The request to the URL contains the standard request parameters.
   * @return notificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to be invoked when the Call is parked. The request to the URL contains the standard request parameters.")

  public String getNotificationUrl() {
    return notificationUrl;
  }


  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Park park = (Park) o;
    return Objects.equals(this.waitUrl, park.waitUrl) &&
        Objects.equals(this.actionUrl, park.actionUrl) &&
        Objects.equals(this.notificationUrl, park.notificationUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitUrl, actionUrl, notificationUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Park {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    waitUrl: ").append(toIndentedString(waitUrl)).append("\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("waitUrl", () -> this.getWaitUrl());
    attributes.put("actionUrl", () -> this.getActionUrl());
    attributes.put("notificationUrl", () -> this.getNotificationUrl());
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

