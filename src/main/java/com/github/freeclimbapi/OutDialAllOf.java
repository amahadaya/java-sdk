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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * OutDialAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutDialAllOf {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_CALL_CONNECT_URL = "callConnectUrl";
  @SerializedName(SERIALIZED_NAME_CALL_CONNECT_URL)
  private String callConnectUrl;

  public static final String SERIALIZED_NAME_CALLING_NUMBER = "callingNumber";
  @SerializedName(SERIALIZED_NAME_CALLING_NUMBER)
  private BigDecimal callingNumber;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private BigDecimal destination;

  public static final String SERIALIZED_NAME_IF_MACHINE = "ifMachine";
  @SerializedName(SERIALIZED_NAME_IF_MACHINE)
  private String ifMachine;

  public static final String SERIALIZED_NAME_IF_MACHINE_URL = "ifMachineUrl";
  @SerializedName(SERIALIZED_NAME_IF_MACHINE_URL)
  private String ifMachineUrl;

  public static final String SERIALIZED_NAME_SEND_DIGITS = "sendDigits";
  @SerializedName(SERIALIZED_NAME_SEND_DIGITS)
  private String sendDigits;

  public static final String SERIALIZED_NAME_STATUS_CALLBACK_URL = "statusCallbackUrl";
  @SerializedName(SERIALIZED_NAME_STATUS_CALLBACK_URL)
  private String statusCallbackUrl;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public OutDialAllOf() { 
  }

  public OutDialAllOf actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * URL to which FreeClimb sends an HTTP POST request. 
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL to which FreeClimb sends an HTTP POST request. ")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public OutDialAllOf callConnectUrl(String callConnectUrl) {
    
    this.callConnectUrl = callConnectUrl;
    return this;
  }

   /**
   * URL to which FreeClimb makes an HTTP POST request informing the result of the OutDial.
   * @return callConnectUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL to which FreeClimb makes an HTTP POST request informing the result of the OutDial.")

  public String getCallConnectUrl() {
    return callConnectUrl;
  }


  public void setCallConnectUrl(String callConnectUrl) {
    this.callConnectUrl = callConnectUrl;
  }


  public OutDialAllOf callingNumber(BigDecimal callingNumber) {
    
    this.callingNumber = callingNumber;
    return this;
  }

   /**
   * he caller ID to show to the called party when FreeClimb calls. This can be one of the following: The To or From number provided in the first Webhook to your webserver. Any phone number you have purchased from FreeClimb.
   * @return callingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "he caller ID to show to the called party when FreeClimb calls. This can be one of the following: The To or From number provided in the first Webhook to your webserver. Any phone number you have purchased from FreeClimb.")

  public BigDecimal getCallingNumber() {
    return callingNumber;
  }


  public void setCallingNumber(BigDecimal callingNumber) {
    this.callingNumber = callingNumber;
  }


  public OutDialAllOf destination(BigDecimal destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * E.164 representation of the phone number to Call. 
   * @return destination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "E.164 representation of the phone number to Call. ")

  public BigDecimal getDestination() {
    return destination;
  }


  public void setDestination(BigDecimal destination) {
    this.destination = destination;
  }


  public OutDialAllOf ifMachine(String ifMachine) {
    
    this.ifMachine = ifMachine;
    return this;
  }

   /**
   * Specifies how FreeClimb should handle this OutDial if an answering machine answers the Call. Valid values: &#x60;redirect&#x60; invokes the ifMachineUrl for instructions. &#x60;hangup&#x60; hangs up the Call. The ifMachineUrl will not be invoked.
   * @return ifMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies how FreeClimb should handle this OutDial if an answering machine answers the Call. Valid values: `redirect` invokes the ifMachineUrl for instructions. `hangup` hangs up the Call. The ifMachineUrl will not be invoked.")

  public String getIfMachine() {
    return ifMachine;
  }


  public void setIfMachine(String ifMachine) {
    this.ifMachine = ifMachine;
  }


  public OutDialAllOf ifMachineUrl(String ifMachineUrl) {
    
    this.ifMachineUrl = ifMachineUrl;
    return this;
  }

   /**
   * When the &#x60;ifMachine&#x60; flag is set to &#x60;redirect&#x60;, this attribute specifies a URL to which FreeClimb makes a POST request when an answering machine or a fax machine is detected. This URL is required if the &#x60;ifMachine&#x60; flag is set to &#x60;redirect&#x60;. Otherwise, it should not be included.
   * @return ifMachineUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the `ifMachine` flag is set to `redirect`, this attribute specifies a URL to which FreeClimb makes a POST request when an answering machine or a fax machine is detected. This URL is required if the `ifMachine` flag is set to `redirect`. Otherwise, it should not be included.")

  public String getIfMachineUrl() {
    return ifMachineUrl;
  }


  public void setIfMachineUrl(String ifMachineUrl) {
    this.ifMachineUrl = ifMachineUrl;
  }


  public OutDialAllOf sendDigits(String sendDigits) {
    
    this.sendDigits = sendDigits;
    return this;
  }

   /**
   * DTMF tones to play to the outdialed Call. This is typically used to dial a number and then dial an extension.
   * @return sendDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DTMF tones to play to the outdialed Call. This is typically used to dial a number and then dial an extension.")

  public String getSendDigits() {
    return sendDigits;
  }


  public void setSendDigits(String sendDigits) {
    this.sendDigits = sendDigits;
  }


  public OutDialAllOf statusCallbackUrl(String statusCallbackUrl) {
    
    this.statusCallbackUrl = statusCallbackUrl;
    return this;
  }

   /**
   * When the outdialed Call leg terminates, FreeClimb sends a &#x60;callStatus&#x60; Webhook to the &#x60;statusCallbackUrl&#x60;. This is a notification only; any PerCL command returned is ignored.
   * @return statusCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the outdialed Call leg terminates, FreeClimb sends a `callStatus` Webhook to the `statusCallbackUrl`. This is a notification only; any PerCL command returned is ignored.")

  public String getStatusCallbackUrl() {
    return statusCallbackUrl;
  }


  public void setStatusCallbackUrl(String statusCallbackUrl) {
    this.statusCallbackUrl = statusCallbackUrl;
  }


  public OutDialAllOf timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Maximum time in seconds the &#x60;OutDial&#x60; command waits for the called party to answer the Call. When a timeout occurs, FreeClimb invokes the &#x60;callConnectUrl&#x60; Webhook to report that the out-dialed Call has ended with a status of &#x60;noAnswer&#x60;.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum time in seconds the `OutDial` command waits for the called party to answer the Call. When a timeout occurs, FreeClimb invokes the `callConnectUrl` Webhook to report that the out-dialed Call has ended with a status of `noAnswer`.")

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public OutDialAllOf privacyMode(Boolean privacyMode) {
    
    this.privacyMode = privacyMode;
    return this;
  }

   /**
   * Parameter &#x60;privacyMode&#x60; will not log the &#x60;text&#x60; as required by PCI compliance.
   * @return privacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter `privacyMode` will not log the `text` as required by PCI compliance.")

  public Boolean getPrivacyMode() {
    return privacyMode;
  }


  public void setPrivacyMode(Boolean privacyMode) {
    this.privacyMode = privacyMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutDialAllOf outDialAllOf = (OutDialAllOf) o;
    return Objects.equals(this.actionUrl, outDialAllOf.actionUrl) &&
        Objects.equals(this.callConnectUrl, outDialAllOf.callConnectUrl) &&
        Objects.equals(this.callingNumber, outDialAllOf.callingNumber) &&
        Objects.equals(this.destination, outDialAllOf.destination) &&
        Objects.equals(this.ifMachine, outDialAllOf.ifMachine) &&
        Objects.equals(this.ifMachineUrl, outDialAllOf.ifMachineUrl) &&
        Objects.equals(this.sendDigits, outDialAllOf.sendDigits) &&
        Objects.equals(this.statusCallbackUrl, outDialAllOf.statusCallbackUrl) &&
        Objects.equals(this.timeout, outDialAllOf.timeout) &&
        Objects.equals(this.privacyMode, outDialAllOf.privacyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, callConnectUrl, callingNumber, destination, ifMachine, ifMachineUrl, sendDigits, statusCallbackUrl, timeout, privacyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutDialAllOf {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    callConnectUrl: ").append(toIndentedString(callConnectUrl)).append("\n");
    sb.append("    callingNumber: ").append(toIndentedString(callingNumber)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ifMachine: ").append(toIndentedString(ifMachine)).append("\n");
    sb.append("    ifMachineUrl: ").append(toIndentedString(ifMachineUrl)).append("\n");
    sb.append("    sendDigits: ").append(toIndentedString(sendDigits)).append("\n");
    sb.append("    statusCallbackUrl: ").append(toIndentedString(statusCallbackUrl)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
    sb.append("}");
    return sb.toString();
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

