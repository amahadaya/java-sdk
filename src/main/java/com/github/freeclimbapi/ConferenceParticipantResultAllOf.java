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
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * ConferenceParticipantResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T17:12:48.532-05:00[America/Chicago]")
public class ConferenceParticipantResultAllOf {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_TALK = "talk";
  @SerializedName(SERIALIZED_NAME_TALK)
  private Boolean talk;

  public static final String SERIALIZED_NAME_LISTEN = "listen";
  @SerializedName(SERIALIZED_NAME_LISTEN)
  private Boolean listen;

  public static final String SERIALIZED_NAME_START_CONF_ON_ENTER = "startConfOnEnter";
  @SerializedName(SERIALIZED_NAME_START_CONF_ON_ENTER)
  private Boolean startConfOnEnter;

  public ConferenceParticipantResultAllOf() { 
  }

  public ConferenceParticipantResultAllOf accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that created this participant.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that created this participant.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ConferenceParticipantResultAllOf conferenceId(String conferenceId) {
    
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference this participant is in.
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the conference this participant is in.")

  public String getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  public ConferenceParticipantResultAllOf callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * ID of the Call associated with this Participant.
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Call associated with this Participant.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public ConferenceParticipantResultAllOf talk(Boolean talk) {
    
    this.talk = talk;
    return this;
  }

   /**
   * True if this Participant has talk privileges in the Conference. False otherwise.
   * @return talk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this Participant has talk privileges in the Conference. False otherwise.")

  public Boolean getTalk() {
    return talk;
  }


  public void setTalk(Boolean talk) {
    this.talk = talk;
  }


  public ConferenceParticipantResultAllOf listen(Boolean listen) {
    
    this.listen = listen;
    return this;
  }

   /**
   * True if this Participant has listen privileges in the Conference. False otherwise.
   * @return listen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this Participant has listen privileges in the Conference. False otherwise.")

  public Boolean getListen() {
    return listen;
  }


  public void setListen(Boolean listen) {
    this.listen = listen;
  }


  public ConferenceParticipantResultAllOf startConfOnEnter(Boolean startConfOnEnter) {
    
    this.startConfOnEnter = startConfOnEnter;
    return this;
  }

   /**
   * True if this Participant joining the Conference caused the Conference to start (status &#x3D; inProgress). False otherwise.
   * @return startConfOnEnter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this Participant joining the Conference caused the Conference to start (status = inProgress). False otherwise.")

  public Boolean getStartConfOnEnter() {
    return startConfOnEnter;
  }


  public void setStartConfOnEnter(Boolean startConfOnEnter) {
    this.startConfOnEnter = startConfOnEnter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceParticipantResultAllOf conferenceParticipantResultAllOf = (ConferenceParticipantResultAllOf) o;
    return Objects.equals(this.accountId, conferenceParticipantResultAllOf.accountId) &&
        Objects.equals(this.conferenceId, conferenceParticipantResultAllOf.conferenceId) &&
        Objects.equals(this.callId, conferenceParticipantResultAllOf.callId) &&
        Objects.equals(this.talk, conferenceParticipantResultAllOf.talk) &&
        Objects.equals(this.listen, conferenceParticipantResultAllOf.listen) &&
        Objects.equals(this.startConfOnEnter, conferenceParticipantResultAllOf.startConfOnEnter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conferenceId, callId, talk, listen, startConfOnEnter);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceParticipantResultAllOf {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    talk: ").append(toIndentedString(talk)).append("\n");
    sb.append("    listen: ").append(toIndentedString(listen)).append("\n");
    sb.append("    startConfOnEnter: ").append(toIndentedString(startConfOnEnter)).append("\n");
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

