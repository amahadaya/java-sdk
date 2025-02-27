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
import com.github.freeclimbapi.PerclCommand;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * GetDigitsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDigitsAllOf {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_DIGIT_TIMEOUT_MS = "digitTimeoutMs";
  @SerializedName(SERIALIZED_NAME_DIGIT_TIMEOUT_MS)
  private Integer digitTimeoutMs;

  public static final String SERIALIZED_NAME_FINISH_ON_KEY = "finishOnKey";
  @SerializedName(SERIALIZED_NAME_FINISH_ON_KEY)
  private String finishOnKey;

  public static final String SERIALIZED_NAME_FLUSH_BUFFER = "flushBuffer";
  @SerializedName(SERIALIZED_NAME_FLUSH_BUFFER)
  private Boolean flushBuffer;

  public static final String SERIALIZED_NAME_INITIAL_TIMEOUT_MS = "initialTimeoutMs";
  @SerializedName(SERIALIZED_NAME_INITIAL_TIMEOUT_MS)
  private String initialTimeoutMs;

  public static final String SERIALIZED_NAME_MAX_DIGITS = "maxDigits";
  @SerializedName(SERIALIZED_NAME_MAX_DIGITS)
  private Integer maxDigits;

  public static final String SERIALIZED_NAME_MIN_DIGITS = "minDigits";
  @SerializedName(SERIALIZED_NAME_MIN_DIGITS)
  private Integer minDigits;

  public static final String SERIALIZED_NAME_PROMPTS = "prompts";
  @SerializedName(SERIALIZED_NAME_PROMPTS)
  private List<PerclCommand> prompts = null;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public GetDigitsAllOf() { 
  }

  public GetDigitsAllOf actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * When the Caller has finished entering digits, FreeClimb will make an HTTP POST request to this URL. A PerCL response is expected to continue handling the Call. Make sure to keep “http://“ in the URL.
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When the Caller has finished entering digits, FreeClimb will make an HTTP POST request to this URL. A PerCL response is expected to continue handling the Call. Make sure to keep “http://“ in the URL.")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public GetDigitsAllOf digitTimeoutMs(Integer digitTimeoutMs) {
    
    this.digitTimeoutMs = digitTimeoutMs;
    return this;
  }

   /**
   *  Maximum time in milliseconds that FreeClimb will wait for the Caller to press any digit after the last digit entered, before making a determination that a &#x60;timeout&#x60; has occurred and moving on to make the request to the actionUrl to submit the results of the &#x60;GetDigits&#x60; command. This timeout interval begins and resets after each digit entered.
   * @return digitTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Maximum time in milliseconds that FreeClimb will wait for the Caller to press any digit after the last digit entered, before making a determination that a `timeout` has occurred and moving on to make the request to the actionUrl to submit the results of the `GetDigits` command. This timeout interval begins and resets after each digit entered.")

  public Integer getDigitTimeoutMs() {
    return digitTimeoutMs;
  }


  public void setDigitTimeoutMs(Integer digitTimeoutMs) {
    this.digitTimeoutMs = digitTimeoutMs;
  }


  public GetDigitsAllOf finishOnKey(String finishOnKey) {
    
    this.finishOnKey = finishOnKey;
    return this;
  }

   /**
   * Digit that causes the input sequence to be deemed complete. This attribute defers to the &#x60;timeout&#x60; attribute – so, if a &#x60;timeout&#x60; occurs, then the command terminates regardless of the value of &#x60;finishOnKey&#x60;.
   * @return finishOnKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Digit that causes the input sequence to be deemed complete. This attribute defers to the `timeout` attribute – so, if a `timeout` occurs, then the command terminates regardless of the value of `finishOnKey`.")

  public String getFinishOnKey() {
    return finishOnKey;
  }


  public void setFinishOnKey(String finishOnKey) {
    this.finishOnKey = finishOnKey;
  }


  public GetDigitsAllOf flushBuffer(Boolean flushBuffer) {
    
    this.flushBuffer = flushBuffer;
    return this;
  }

   /**
   * If set to true, the FreeClimb platform starts with an empty DTMF buffer to store the digits entered by the caller. If set to false, FreeClimb will append the user inputs to the end of the existing digits buffer and will return digits from the start of the digits buffer.
   * @return flushBuffer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, the FreeClimb platform starts with an empty DTMF buffer to store the digits entered by the caller. If set to false, FreeClimb will append the user inputs to the end of the existing digits buffer and will return digits from the start of the digits buffer.")

  public Boolean getFlushBuffer() {
    return flushBuffer;
  }


  public void setFlushBuffer(Boolean flushBuffer) {
    this.flushBuffer = flushBuffer;
  }


  public GetDigitsAllOf initialTimeoutMs(String initialTimeoutMs) {
    
    this.initialTimeoutMs = initialTimeoutMs;
    return this;
  }

   /**
   * Maximum time in milliseconds that FreeClimb will wait for the Caller to press the first digit before making a determination that a &#x60;timeout&#x60; has occurred and moving on to make the request to the &#x60;actionUrl&#x60; to submit the results of the &#x60;GetDigits&#x60; command. This timeout interval begins when all nested commands have been fully executed.
   * @return initialTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum time in milliseconds that FreeClimb will wait for the Caller to press the first digit before making a determination that a `timeout` has occurred and moving on to make the request to the `actionUrl` to submit the results of the `GetDigits` command. This timeout interval begins when all nested commands have been fully executed.")

  public String getInitialTimeoutMs() {
    return initialTimeoutMs;
  }


  public void setInitialTimeoutMs(String initialTimeoutMs) {
    this.initialTimeoutMs = initialTimeoutMs;
  }


  public GetDigitsAllOf maxDigits(Integer maxDigits) {
    
    this.maxDigits = maxDigits;
    return this;
  }

   /**
   * Maximum number of digits expected in the input. If the terminating digit is not entered and the caller has entered the maximum number of digits allowed, the &#x60;GetDigits&#x60; command terminates regardless of the value of &#x60;finishOnKey&#x60;.
   * @return maxDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of digits expected in the input. If the terminating digit is not entered and the caller has entered the maximum number of digits allowed, the `GetDigits` command terminates regardless of the value of `finishOnKey`.")

  public Integer getMaxDigits() {
    return maxDigits;
  }


  public void setMaxDigits(Integer maxDigits) {
    this.maxDigits = maxDigits;
  }


  public GetDigitsAllOf minDigits(Integer minDigits) {
    
    this.minDigits = minDigits;
    return this;
  }

   /**
   * Minimum number of digits expected in the input. If specified, FreeClimb will return the collected digits only if the Caller has entered at least that many digits.
   * @return minDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of digits expected in the input. If specified, FreeClimb will return the collected digits only if the Caller has entered at least that many digits.")

  public Integer getMinDigits() {
    return minDigits;
  }


  public void setMinDigits(Integer minDigits) {
    this.minDigits = minDigits;
  }


  public GetDigitsAllOf prompts(List<PerclCommand> prompts) {
    
    this.prompts = prompts;
    return this;
  }

  public GetDigitsAllOf addPromptsItem(PerclCommand promptsItem) {
    if (this.prompts == null) {
      this.prompts = new ArrayList<PerclCommand>();
    }
    this.prompts.add(promptsItem);
    return this;
  }

   /**
   * JSON array of PerCL commands to nest within the &#x60;GetDigits&#x60; command. The &#x60;Say&#x60;, &#x60;Play&#x60;, and &#x60;Pause&#x60; commands can be used. The nested actions are executed while FreeClimb is waiting for input from the Caller.
   * @return prompts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON array of PerCL commands to nest within the `GetDigits` command. The `Say`, `Play`, and `Pause` commands can be used. The nested actions are executed while FreeClimb is waiting for input from the Caller.")

  public List<PerclCommand> getPrompts() {
    return prompts;
  }


  public void setPrompts(List<PerclCommand> prompts) {
    this.prompts = prompts;
  }


  public GetDigitsAllOf privacyMode(Boolean privacyMode) {
    
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
    GetDigitsAllOf getDigitsAllOf = (GetDigitsAllOf) o;
    return Objects.equals(this.actionUrl, getDigitsAllOf.actionUrl) &&
        Objects.equals(this.digitTimeoutMs, getDigitsAllOf.digitTimeoutMs) &&
        Objects.equals(this.finishOnKey, getDigitsAllOf.finishOnKey) &&
        Objects.equals(this.flushBuffer, getDigitsAllOf.flushBuffer) &&
        Objects.equals(this.initialTimeoutMs, getDigitsAllOf.initialTimeoutMs) &&
        Objects.equals(this.maxDigits, getDigitsAllOf.maxDigits) &&
        Objects.equals(this.minDigits, getDigitsAllOf.minDigits) &&
        Objects.equals(this.prompts, getDigitsAllOf.prompts) &&
        Objects.equals(this.privacyMode, getDigitsAllOf.privacyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, digitTimeoutMs, finishOnKey, flushBuffer, initialTimeoutMs, maxDigits, minDigits, prompts, privacyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDigitsAllOf {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    digitTimeoutMs: ").append(toIndentedString(digitTimeoutMs)).append("\n");
    sb.append("    finishOnKey: ").append(toIndentedString(finishOnKey)).append("\n");
    sb.append("    flushBuffer: ").append(toIndentedString(flushBuffer)).append("\n");
    sb.append("    initialTimeoutMs: ").append(toIndentedString(initialTimeoutMs)).append("\n");
    sb.append("    maxDigits: ").append(toIndentedString(maxDigits)).append("\n");
    sb.append("    minDigits: ").append(toIndentedString(minDigits)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
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

