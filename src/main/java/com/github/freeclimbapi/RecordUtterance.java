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
import com.github.freeclimbapi.RecordUtteranceAllOf;
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
 * The &#x60;RecordUtterance&#x60; command records the caller&#39;s voice and returns the URL of a file containing the audio recording. &#x60;RecordUtterance&#x60; is blocking and is a terminal command. As such, the &#x60;actionUrl&#x60; property is required, and control of the Call picks up using the PerCL returned in response to the &#x60;actionUrl&#x60;. Recording information is returned in the &#x60;actionUrl&#x60; request.
 */
@ApiModel(description = "The `RecordUtterance` command records the caller's voice and returns the URL of a file containing the audio recording. `RecordUtterance` is blocking and is a terminal command. As such, the `actionUrl` property is required, and control of the Call picks up using the PerCL returned in response to the `actionUrl`. Recording information is returned in the `actionUrl` request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordUtterance extends PerclCommand {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_SILENCE_TIMEOUT_MS = "silenceTimeoutMs";
  @SerializedName(SERIALIZED_NAME_SILENCE_TIMEOUT_MS)
  private Integer silenceTimeoutMs;

  public static final String SERIALIZED_NAME_FINISH_ON_KEY = "finishOnKey";
  @SerializedName(SERIALIZED_NAME_FINISH_ON_KEY)
  private String finishOnKey;

  public static final String SERIALIZED_NAME_MAX_LENGTH_SEC = "maxLengthSec";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH_SEC)
  private Integer maxLengthSec;

  public static final String SERIALIZED_NAME_PLAY_BEEP = "playBeep";
  @SerializedName(SERIALIZED_NAME_PLAY_BEEP)
  private Boolean playBeep;

  public static final String SERIALIZED_NAME_AUTO_START = "autoStart";
  @SerializedName(SERIALIZED_NAME_AUTO_START)
  private Boolean autoStart;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public RecordUtterance() { 
    this.command = this.getClass().getSimpleName();
  }

  public RecordUtterance actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * URL to which information on the completed recording is submitted. The PerCL received in response is then used to continue with Call processing.
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL to which information on the completed recording is submitted. The PerCL received in response is then used to continue with Call processing.")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public RecordUtterance silenceTimeoutMs(Integer silenceTimeoutMs) {
    
    this.silenceTimeoutMs = silenceTimeoutMs;
    return this;
  }

   /**
   * Interval of silence that should elapse before ending the recording.
   * @return silenceTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval of silence that should elapse before ending the recording.")

  public Integer getSilenceTimeoutMs() {
    return silenceTimeoutMs;
  }


  public void setSilenceTimeoutMs(Integer silenceTimeoutMs) {
    this.silenceTimeoutMs = silenceTimeoutMs;
  }


  public RecordUtterance finishOnKey(String finishOnKey) {
    
    this.finishOnKey = finishOnKey;
    return this;
  }

   /**
   * Key that triggers the end of the recording. any digit, &#39;#&#39;, or &#39;*&#39;
   * @return finishOnKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key that triggers the end of the recording. any digit, '#', or '*'")

  public String getFinishOnKey() {
    return finishOnKey;
  }


  public void setFinishOnKey(String finishOnKey) {
    this.finishOnKey = finishOnKey;
  }


  public RecordUtterance maxLengthSec(Integer maxLengthSec) {
    
    this.maxLengthSec = maxLengthSec;
    return this;
  }

   /**
   * Maximum length for the command execution in seconds.
   * @return maxLengthSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum length for the command execution in seconds.")

  public Integer getMaxLengthSec() {
    return maxLengthSec;
  }


  public void setMaxLengthSec(Integer maxLengthSec) {
    this.maxLengthSec = maxLengthSec;
  }


  public RecordUtterance playBeep(Boolean playBeep) {
    
    this.playBeep = playBeep;
    return this;
  }

   /**
   * Indicates whether to play a beep sound before the start of the recording. If set to &#x60;false&#x60;, no beep is played.
   * @return playBeep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to play a beep sound before the start of the recording. If set to `false`, no beep is played.")

  public Boolean getPlayBeep() {
    return playBeep;
  }


  public void setPlayBeep(Boolean playBeep) {
    this.playBeep = playBeep;
  }


  public RecordUtterance autoStart(Boolean autoStart) {
    
    this.autoStart = autoStart;
    return this;
  }

   /**
   * If &#x60;false&#x60;, recording begins immediately after the RecordUtterance command is processed. If &#x60;true&#x60;, recording begins when audio is present and if audio begins before the &#x60;maxLengthSec&#x60; timeout. If no audio begins before &#x60;maxLengthSec&#x60;, no recording is generated.
   * @return autoStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `false`, recording begins immediately after the RecordUtterance command is processed. If `true`, recording begins when audio is present and if audio begins before the `maxLengthSec` timeout. If no audio begins before `maxLengthSec`, no recording is generated.")

  public Boolean getAutoStart() {
    return autoStart;
  }


  public void setAutoStart(Boolean autoStart) {
    this.autoStart = autoStart;
  }


  public RecordUtterance privacyMode(Boolean privacyMode) {
    
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
    RecordUtterance recordUtterance = (RecordUtterance) o;
    return Objects.equals(this.actionUrl, recordUtterance.actionUrl) &&
        Objects.equals(this.silenceTimeoutMs, recordUtterance.silenceTimeoutMs) &&
        Objects.equals(this.finishOnKey, recordUtterance.finishOnKey) &&
        Objects.equals(this.maxLengthSec, recordUtterance.maxLengthSec) &&
        Objects.equals(this.playBeep, recordUtterance.playBeep) &&
        Objects.equals(this.autoStart, recordUtterance.autoStart) &&
        Objects.equals(this.privacyMode, recordUtterance.privacyMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, silenceTimeoutMs, finishOnKey, maxLengthSec, playBeep, autoStart, privacyMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordUtterance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    silenceTimeoutMs: ").append(toIndentedString(silenceTimeoutMs)).append("\n");
    sb.append("    finishOnKey: ").append(toIndentedString(finishOnKey)).append("\n");
    sb.append("    maxLengthSec: ").append(toIndentedString(maxLengthSec)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    autoStart: ").append(toIndentedString(autoStart)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("actionUrl", () -> this.getActionUrl());
    attributes.put("silenceTimeoutMs", () -> this.getSilenceTimeoutMs());
    attributes.put("finishOnKey", () -> this.getFinishOnKey());
    attributes.put("maxLengthSec", () -> this.getMaxLengthSec());
    attributes.put("playBeep", () -> this.getPlayBeep());
    attributes.put("autoStart", () -> this.getAutoStart());
    attributes.put("privacyMode", () -> this.getPrivacyMode());
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

