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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * UpdateConferenceParticipantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateConferenceParticipantRequest {
  public static final String SERIALIZED_NAME_TALK = "talk";
  @SerializedName(SERIALIZED_NAME_TALK)
  private Boolean talk;

  public static final String SERIALIZED_NAME_LISTEN = "listen";
  @SerializedName(SERIALIZED_NAME_LISTEN)
  private Boolean listen;

  public UpdateConferenceParticipantRequest() { 
  }

  public UpdateConferenceParticipantRequest talk(Boolean talk) {
    
    this.talk = talk;
    return this;
  }

   /**
   * (Optional) Default is &#x60;true&#x60;. Setting to &#x60;false&#x60; mutes the Participant. FreeClimb returns an error and ignores any other value.
   * @return talk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) Default is `true`. Setting to `false` mutes the Participant. FreeClimb returns an error and ignores any other value.")

  public Boolean getTalk() {
    return talk;
  }


  public void setTalk(Boolean talk) {
    this.talk = talk;
  }


  public UpdateConferenceParticipantRequest listen(Boolean listen) {
    
    this.listen = listen;
    return this;
  }

   /**
   * (Optional) Default is &#x60;true&#x60;. Setting to &#x60;false&#x60; silences the Conference for this Participant. FreeClimb returns an error and ignores any other value.
   * @return listen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) Default is `true`. Setting to `false` silences the Conference for this Participant. FreeClimb returns an error and ignores any other value.")

  public Boolean getListen() {
    return listen;
  }


  public void setListen(Boolean listen) {
    this.listen = listen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConferenceParticipantRequest updateConferenceParticipantRequest = (UpdateConferenceParticipantRequest) o;
    return Objects.equals(this.talk, updateConferenceParticipantRequest.talk) &&
        Objects.equals(this.listen, updateConferenceParticipantRequest.listen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(talk, listen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConferenceParticipantRequest {\n");
    sb.append("    talk: ").append(toIndentedString(talk)).append("\n");
    sb.append("    listen: ").append(toIndentedString(listen)).append("\n");
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

